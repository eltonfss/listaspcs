package lista02;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lista02 {
    
    public static void main(String[] args) {
         try {
            Lista02 lista02 = new Lista02();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número do exercício que deseja executar:");
            Integer nexercicio = scanner.nextInt();
            Boolean invocou = false;
            Class c = Class.forName("lista02.Lista02");
            Method m[] = c.getDeclaredMethods();
            for(Method method : m){
                if(method.getName().equals("exercicio"+nexercicio)){
                    invocou = (Boolean) method.invoke(lista02);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Lista02.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void exercicio1() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a string de entrada:");
        String entrada = s.next();
        Boolean palindromo = true;
        for(int i = 0; i < entrada.length(); i++){
            if(entrada.charAt(i) != entrada.charAt(entrada.length()-1-i)){
                palindromo = false;
            }
        }
        if(palindromo){
            System.out.println("a) É palíndromo");
        }else{
            System.out.println("a) Não é palíndromo");
        }
        System.out.println("b) "+entrada.length());
    }
    
    public void exercicio2(){
        Scanner s = new Scanner(System.in);
        System.out.print("Entre o número:");
        Integer entrada = s.nextInt();
        String[] numeros = {"zero","um","dois","três","quatro","cinco","seis","sete","oito","nove"};
        System.out.println("Resultado: ");
        for(int i = 0; i < entrada.toString().length(); i++){
            System.out.println(numeros[entrada.toString().charAt(i) - '0']);
        }
    }
    
    public void exercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("a) Escreva sua solução usando BigDecimal");
        System.out.println("Digite o valor de seu salário ao longo de 12 meses: ");
        BigDecimal salario = new BigDecimal(scanner.next());
        BigDecimal aliquota;
        BigDecimal deducaoDoImposto;
        if(salario.compareTo(new BigDecimal(1449.15)) <= 0){
            aliquota = new BigDecimal(0);
            deducaoDoImposto = new BigDecimal(0);
        }else if((salario.compareTo(new BigDecimal(1449.16)) >= 0)&&(salario.compareTo(new BigDecimal(2246.75)) <= 0)){
            aliquota = new BigDecimal(0.075);
            deducaoDoImposto = new BigDecimal(112.43);
        }else if((salario.compareTo(new BigDecimal(2246.76)) >= 0)&&(salario.compareTo(new BigDecimal(2995.70)) <= 0)){
            aliquota = new BigDecimal(0.15);
            deducaoDoImposto = new BigDecimal(280.94);
        }else if((salario.compareTo(new BigDecimal(2995.71)) >= 0)&&(salario.compareTo(new BigDecimal(3743.19)) <= 0)){
            aliquota = new BigDecimal(0.225);
            deducaoDoImposto = new BigDecimal(505.62);
        }else{
            aliquota = new BigDecimal(0.275);
            deducaoDoImposto = new BigDecimal(692.78);
        }
        BigDecimal imposto = salario.multiply(aliquota).subtract(deducaoDoImposto);
        
        System.out.println("Salário Bruto: " + salario);
        System.out.println("Alíquota: " + aliquota.multiply(new BigDecimal(100.00))+"%");
        System.out.println("Parcela a Deduzir do Imposto: " + deducaoDoImposto);
        System.out.println("Imposto: "+imposto);
        System.out.println("Salário Líquido:" + salario.subtract(imposto));
        
        System.out.println("b) Escreva outra solução usando números inteiros");
        
        System.out.println("Digite o valor de seu salário ao longo de 12 meses: ");
        int salarioInteiro = (int) (scanner.nextDouble()*1000);
        int aliquotaInteiro;
        int deducaoDoImpostoInteiro;
        if(salarioInteiro < 1449150){
            aliquotaInteiro = 0;
            deducaoDoImpostoInteiro = 0;
        }else if((salarioInteiro >= 1449160)&&(salarioInteiro <= 2246750)){
            aliquotaInteiro = 0075;
            deducaoDoImpostoInteiro = 112430;
        }else if((salarioInteiro >= 2246760)&&(salarioInteiro <= 2995700)){
            aliquotaInteiro = 150;
            deducaoDoImpostoInteiro = 280940;
        }else if((salarioInteiro >= 2995710)&&(salarioInteiro <= 3743190)){
            aliquotaInteiro = 225;
            deducaoDoImpostoInteiro = 505620;
        }else{
            aliquotaInteiro = 275;
            deducaoDoImpostoInteiro = 692780;
        }
        int impostoInteiro = ((int)(((double)salarioInteiro*(double)aliquotaInteiro)/1000)-deducaoDoImpostoInteiro);
        
        System.out.println("Salário Bruto: " +((double)salarioInteiro/1000));
        System.out.println("Alíquota: " +((double)aliquotaInteiro/100)+"%");
        System.out.println("Parcela a Deduzir do Imposto: " + ((double)deducaoDoImpostoInteiro/1000));
        System.out.println("Imposto: "+((double)impostoInteiro/1000));
        System.out.println("Salário Líquido:" + ((double)(salarioInteiro-impostoInteiro)/1000));

    }
    
    public void exercicio4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scanner.nextLine();
        String[] nomes = nomeCompleto.split("\\s+");
        String[] conectores = {"e","do","da","das","de","di","di","du"};
        StringBuilder iniciais = new StringBuilder();
        boolean eConector = false;
        for (String nome : nomes) {
            for (String conector : conectores) {
                if(nome.toLowerCase().equals(conector)){
                   eConector = true;
                   break;
                }else{
                    eConector = false;
                }
            }
            if(!eConector){
                iniciais.append(nome.toUpperCase().charAt(0));
            }
        }
        System.out.println("Iniciais: "+iniciais);
    }
    
    public void exercicio5(){
        
    }
    
    public void exercicio6(){
        
    }
    
    public void exercicio7(){
        
    }
    
    public void exercicio8(){
        
    }
    
    public void exercicio9(){
        
    }
    
    public void exercicio10(){
        
    }
    
}
