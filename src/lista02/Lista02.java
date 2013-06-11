package lista02;

import java.lang.reflect.Method;
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
        
    }
    
    public void exercicio4(){
        
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
