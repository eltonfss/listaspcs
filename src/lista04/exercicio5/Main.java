package lista04.exercicio5;

import java.util.Scanner;
import lista03.exercicio3.Data;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do correntista: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a data de abertura(dd/mm/aaaa): ");
        String[] dataDeAbertura = scanner.nextLine().split("/");
        System.out.print("Digite o saldo: ");
        double saldo = scanner.nextDouble();
        ContaCorrente contaCorrente = new ContaCorrente(nome, new Data(Integer.parseInt(dataDeAbertura[0]), Integer.parseInt(dataDeAbertura[1]), Integer.parseInt(dataDeAbertura[2])), saldo);
        System.out.println("Nome do Correntista: "+contaCorrente.getCorrentista());
        System.out.println("Data de abertura: "+contaCorrente.getDataDeAbertura().getDia()+"/"+contaCorrente.getDataDeAbertura().getMes()+"/"+contaCorrente.getDataDeAbertura().getAno());
        System.out.println("Saldo: "+contaCorrente.getSaldo());
        System.out.println("------- Movimentações ------");
        System.out.print("Deseja registrar nova movimentação(1 - sim / 2 - não)? ");
        int continuar = scanner.nextInt();
        while(continuar == 1){
            System.out.print("Digite o valor da movimentação: ");
            Double valor = scanner.nextDouble();
            System.out.print("Digite a data da movimentação(dd/mm/aaaa): ");
            String[] data = scanner.next().split("/");
            contaCorrente.registrarMovimentacao(new Data(Integer.parseInt(data[0]), Integer.parseInt(data[1]), Integer.parseInt(data[2])), valor);
            System.out.print("Deseja registrar nova movimentação(1 - sim / 2 - não)?");
            continuar = scanner.nextInt();
        }
        System.out.println("Saldo final da conta: "+contaCorrente.getSaldo());
        System.out.println("Total de créditos: "+contaCorrente.totalCreditos());
        System.out.println("Total de débitos: "+contaCorrente.totalDebitos());
    }
    
}
