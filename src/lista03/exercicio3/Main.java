package lista03.exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrada:");
        System.out.print("\tDia => ");
        Integer dia = scanner.nextInt();
        System.out.print("\tMês => ");
        Integer mes = scanner.nextInt();
        System.out.print("\tAno => ");
        Integer ano = scanner.nextInt();
        Data data = new Data(dia, mes, ano);
        System.out.println("Saída:");
        String[] diasDaSemanaPorExtenso = {"domingo","segunda-feira","terça-feira","quarta-feira","quinta-feira","sexta-feira","sábado"};
        System.out.println("\t"+data.getDia()+"/"+data.getMes()+"/"+data.getAno()+" => "+diasDaSemanaPorExtenso[data.diaDaSemana()]);
    }
    
    
    
}
