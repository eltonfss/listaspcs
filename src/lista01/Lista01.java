package lista01;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lista01 {

    public static void main(String[] args) {
        try {
            Lista01 lista01 = new Lista01();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o número do exercício que deseja executar:");
            Integer nexercicio = scanner.nextInt();
            Boolean invocou = false;
            Class c = Class.forName("lista01.Lista01");
            Method m[] = c.getDeclaredMethods();
            for(Method method : m){
                if(method.getName().equals("exercicio"+nexercicio)){
                    invocou = (Boolean) method.invoke(lista01);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(Lista01.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void exercicio1() {
            System.out.println("meu primeiro programa de PCS no Netbeans");
    }
    
    public void exercicio2(){
        int a = 10;
        int b = 3;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("a) Soma de a e b = " + (a+b));
        System.out.println("b) Multiplicação de a por b = " + (a*b));
        System.out.println("c) Subtração de a por b = " + (a-b));
        System.out.println("d) O resto da divisão de a por b = " + (a%b));
        System.out.println("e) O resultado da divisão inteira de a por b (resultado é um inteiro) = " + (a/b));
        System.out.println("f) O resultado da divisão de a por b (resultado pode não ser inteiro, ex: 10/3) = " + ((float) a/ (float) b)); 
        System.out.println("g) O resultado da divisão de a por b arredondado para um número inteiro. (ex: um resultado como 9.75 é arredondado para 10) = " + (Math.round(a/b)));
    }
    
    public void exercicio3(){
        float a = 10;
        float b = 3;
        double c = 10;
        double d = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a) Soma (a+b) = "+(a+b)+" e (c+d) = "+(c+d));
        System.out.println("b) Multiplicação (a * b) = "+(a*b)+" e (c * d) = "+(c*d));
        System.out.println("c) Subtração (a – b) = "+(a-b)+" e (c – d)"+(c-d));
        System.out.println("d) Divisão (a / b) = "+(a/b)+" e (c / d) = "+(c/d));
        System.out.println("e) Experimente imprimir o resultado da seguinte subtração 2.0 – 1.1 = " + (2.0-1.1));
        System.out.println("f) Experimente imprimir o resultado da comparação de 0.9 com o resultado da seguinte subtração 2.0 – 1.1 = " +((2.0-1.1) == 0.9));
        System.out.println("g) Imprima o resultado de Float.MAX_VALUE = "+Float.MAX_VALUE+" e Double.MAX_VALUE = "+Double.MAX_VALUE+".");
    }
    
    public void exercicio4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = scanner.nextInt();
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("a) Soma de a e b = " + (a+b));
        System.out.println("b) Multiplicação de a por b = " + (a*b));
        System.out.println("c) Subtração de a por b = " + (a-b));
        System.out.println("d) O resto da divisão de a por b = " + (a%b));
        System.out.println("e) O resultado da divisão inteira de a por b (resultado é um inteiro) = " + (a/b));
        System.out.println("f) O resultado da divisão de a por b (resultado pode não ser inteiro, ex: 10/3) = " + ((float) a/ (float) b)); 
        System.out.println("g) O resultado da divisão de a por b arredondado para um número inteiro. (ex: um resultado como 9.75 é arredondado para 10) = " + (Math.round(a/b)));
    }
    
    public void exercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        float a = scanner.nextFloat();
        System.out.println("Digite o valor de b: ");
        float b = scanner.nextFloat();
        System.out.println("Digite o valor de c: ");
        double c = scanner.nextDouble();
        System.out.println("Digite o valor de d: ");
        double d = scanner.nextDouble();
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a) Soma (a+b) = "+(a+b)+" e (c+d) = "+(c+d));
        System.out.println("b) Multiplicação (a * b) = "+(a*b)+" e (c * d) = "+(c*d));
        System.out.println("c) Subtração (a – b) = "+(a-b)+" e (c – d)"+(c-d));
        System.out.println("d) Divisão (a / b) = "+(a/b)+" e (c / d) = "+(c/d));
        System.out.println("e) Experimente imprimir o resultado da seguinte subtração 2.0 – 1.1 = " + (2.0-1.1));
        System.out.println("f) Experimente imprimir o resultado da comparação de 0.9 com o resultado da seguinte subtração 2.0 – 1.1 = " +((2.0-1.1) == 0.9));
        System.out.println("g) Imprima o resultado de Float.MAX_VALUE = "+Float.MAX_VALUE+" e Double.MAX_VALUE = "+Double.MAX_VALUE+".");
    }
    
    public void exercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o limite inferior: ");
        int limiteInferior = scanner.nextInt();
        System.out.println("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();
        System.out.println("");
        
        System.out.println("minimo: " + limiteInferior);
        System.out.println("máximo: " + limiteSuperior);
        System.out.println("");
        
        int soma = 0;
        int quantidade = 0;
        int impares = 0;
        int divisores[][] = new int[limiteSuperior-limiteInferior+1][limiteSuperior-limiteInferior+1];
        int indexDivisores;
        for(int i = limiteInferior; i <= limiteSuperior; i++){
            soma+=i;
            quantidade++;
            indexDivisores = 0;
            divisores[i-limiteInferior][indexDivisores] = 1;
            if(i%2!=0){
                impares++;
            }else{
                divisores[i-limiteInferior][++indexDivisores] = 2;
            }
            for(int j = divisores[i-limiteInferior][indexDivisores]+1; j <= i; j++){
                if(i%j == 0){
                    divisores[i-limiteInferior][++indexDivisores] = j;
                }
            }
        }
        
        System.out.println("soma: " + soma);
        System.out.println("qtde números: " + quantidade);
        System.out.println("n. ímpares: " + impares);
        
        System.out.println("");
        
        for(int i = 0; i < divisores.length; i++){
            System.out.print("divisores de "+(i+limiteInferior)+": ");
            for(int j = 0; j < divisores[i].length; j++){
                if(divisores[i][j] > 0){
                    System.out.print(divisores[i][j]);
                    if(divisores[i][j] < (i+limiteInferior)){
                        System.out.print(",");
                    }
                }
            }
            System.out.println("");
        }
    }    
    public void exercicio7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do estado cívil: \n 01 - Solteiro \n 02 - Casado \n 03 - Divorciado \n 04 - Viúvo");
        int codigo = scanner.nextInt();
        String[] opcoes = {"Solteiro","Casado","Divorciado","Viúvo"};
        System.out.println(opcoes[codigo-1]);
    }
    
    public void exercicio8(){
        int total = 0;
        int i = 0;
        for(i = 1; i < 12; i=i+2){
            total+=i;
            if(i > 10){
                break;
            }
        }
        System.out.println(" i = " + i);
        System.out.println(" total = " + total);
    }
    
    public void exercicio9(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio:");
        double raio = input.nextDouble();
        double area = 4 * Math.PI * raio * raio;
        double volume = 4/3 * Math.PI * Math.pow(raio, 3);
        
        System.out.println("Raio: " + raio);
        System.out.println("Àrea: " + area);
        System.out.println("Volume: " + volume);
    }
    
    public enum TamanhoPizza{
        Brotinho,
        Grande,
        Familia,
    };
    
    public void exercicio10(){
        //Ler entrada
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número correspondente ao tamanho da pizza: (1 -> Brotinho,2 -> Grande, 3 -> Família)");
        int opcao = input.nextInt();
        
        //Setar valor default
        TamanhoPizza pizzaEscolhida = TamanhoPizza.Brotinho;
        
        //Setar pizzaEscolhida
        for(int i = 0; i < TamanhoPizza.values().length; i++)
            if(opcao-1 == TamanhoPizza.values()[i].ordinal())
                pizzaEscolhida = TamanhoPizza.values()[i];
        
        //Imprimir preço
        switch(pizzaEscolhida){
            case Brotinho:
                System.out.println("R$ 10,00");
                break;
            case Grande: 
                System.out.println("R$ 18,00");
                break;
            case Familia:
                System.out.println("R$ 25,00");
                break;
       }
    }
    
    public void exercicio11(){
        
        int nota = 0;
        int valorAvaliacaoPratica = 0;
        int valorAvaliacaoTeorica = 0;
        int fezProvaTeorica = 0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da avaliação prática: ");
        valorAvaliacaoPratica = scanner.nextInt();
        
        if(valorAvaliacaoPratica >= 70){
            System.out.println("Você fez a prova teórica? 1 - sim / 0 - não");
            fezProvaTeorica = scanner.nextInt();
        }else{
            fezProvaTeorica = 1;
        }
        
        if(fezProvaTeorica == 1){
            System.out.println("Digite o valor da avaliação teórica: ");
            valorAvaliacaoTeorica = scanner.nextInt();
        }
        
        if(valorAvaliacaoPratica >= 70 && fezProvaTeorica == 0){
            nota = valorAvaliacaoPratica;
        }else if(valorAvaliacaoPratica >= 85 && fezProvaTeorica == 1){
            nota = ((Math.max(valorAvaliacaoPratica, valorAvaliacaoTeorica)*4)+Math.min(valorAvaliacaoPratica, valorAvaliacaoTeorica))/5;
        }else if(valorAvaliacaoPratica >=70 && valorAvaliacaoPratica < 85 && fezProvaTeorica == 1){
            nota = ((Math.max(valorAvaliacaoPratica, valorAvaliacaoTeorica)*3)+Math.min(valorAvaliacaoPratica, valorAvaliacaoTeorica))/4;
        }else if(valorAvaliacaoPratica >= 50 && valorAvaliacaoTeorica < 70){
            nota = ((Math.max(valorAvaliacaoPratica, valorAvaliacaoTeorica)*2)+Math.min(valorAvaliacaoPratica, valorAvaliacaoTeorica))/3;
        }else if(valorAvaliacaoPratica < 50){
            nota = (valorAvaliacaoPratica + valorAvaliacaoTeorica)/2;
        }
        
        System.out.println("Nota = "+nota);
        
    }
    
    public void exercicio12(){
        
        Scanner scanner = new Scanner(System.in);
        
        double distancia = 0;
        double combustivel = 0;
        double somaDistancias = 0;
        double somaCombustivel = 0;
        
        DecimalFormat df = new DecimalFormat("#,###.00");  
        
        while(distancia != -1){
                System.out.print("Entre distância percorrida (em km) ou -1 para encerrar:");
                somaDistancias += distancia = scanner.nextDouble();
                if(distancia != -1){
                    System.out.print("Entre quantidade de combustível (em litros):");
                    somaCombustivel += combustivel = scanner.nextDouble();
                    System.out.println("Cosumo = "+df.format(distancia/combustivel)+" km/l");
                    
                    System.out.println("");
                }else{
                    somaDistancias++;
                }
        }
        
        System.out.println("somaDistancias = "+somaDistancias );
        System.out.println("somaCombustivel = "+somaCombustivel);
        
        System.out.println("Consumo Médio: "+df.format(somaDistancias/somaCombustivel)+" km/l");
    }
    
    public void exercicio13(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor máximo da sequência fibonnaci: ");
        int valorMaximo = scanner.nextInt();
        int fib0 = 0;
        System.out.println("Fib(0) = "+fib0);
        int fib1 = 1;
        System.out.println("Fib(1) = "+fib1);
        int fibn = fib0 + fib1;
        int n = 2;
        while(fibn < valorMaximo){
            System.out.println("Fib("+n+") = "+fibn);
            fib0 = fib1;
            fib1 = fibn;
            fibn = fib0 + fib1;
        }
    }
    
    public void exercicio14(){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");  
        int quantidadeA = 0;
        int quantidadeB = 0;
        int somaQuantidadeA = 0;
        int somaQuantidadeB = 0;
        double precoUnitarioA = 0.0;
        double precoUnitarioB = 0.0;
        double totalA = 0.0;
        double totalB = 0.0;
        double somaTotalA = 0.0;
        double somaTotalB = 0.0;
        char continuar = 's';
        
        while(continuar == 's'){
            System.out.println("");
            //Ler quantidades
            System.out.print("Digite a quantidade desejada do produto A:");
            somaQuantidadeA += quantidadeA = scanner.nextInt();
            System.out.print("Digite a quantidade desejada do produto B:");
            somaQuantidadeB += quantidadeB = scanner.nextInt();
            
            //Calcular preço único
            if(quantidadeA <= 5){
                precoUnitarioA = 10.00;
            }else{
                precoUnitarioA = 8.00;
            }
            if(quantidadeB <= 10){
                precoUnitarioB = 20.00;
            }else if(quantidadeB <= 20){
                precoUnitarioB = 18.00;
            }else{
                precoUnitarioB = 16.00;
            }
            
            //Calcular totais e imprimir
            somaTotalA += totalA = quantidadeA*precoUnitarioA;
            somaTotalB += totalB = quantidadeB*precoUnitarioB;
            System.out.println("");
            System.out.println("A: Quantidade: "+quantidadeA+"; Preço Unitário: "+precoUnitarioA+"; Total: "+totalA);
            System.out.println("B: Quantidade: "+quantidadeB+"; Preço Unitário: "+precoUnitarioB+"; Total: "+totalB);
            System.out.println("Total Geral: "+(totalA+totalB));
            System.out.println("");
            System.out.print("Novo pedido (s/n)? ");
            continuar = scanner.next().charAt(0);
            
            
        }
        
        System.out.println("Total dos Pedidos:");
        System.out.println("A: Quantidade:"+somaQuantidadeA+"; Total: "+df.format(somaTotalA));
        System.out.println("B: Quantidade:"+somaQuantidadeB+"; Total: "+df.format(somaTotalB));
        System.out.println("Total Geral: "+df.format(somaTotalA+somaTotalB));

    }
    
}
