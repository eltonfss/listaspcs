package lista04.exercicio6;

import java.util.Date;
import java.util.Scanner;
import lista03.exercicio3.Data;

public class Main {
    
    public static void main(String[] args) {
        Date data = new Date();
        Data hoje = new Data(data.getDay(), data.getMonth(), data.getYear());
        ContaCorrente c1 = new ContaCorrente("Elton", hoje, 200);
        c1.registrarMovimentacao(hoje,300.00);
        c1.registrarMovimentacao(hoje, -50.00);
        c1.registrarMovimentacao(hoje, 230.00);
        c1.registrarMovimentacao(hoje, -20.00);
        System.out.println("Saldo atual conta corrente: "+c1.getSaldo());
        System.out.println("Total de créditos conta corrente: "+c1.totalCreditos());
        System.out.println("Total de débitos conta corrente: "+c1.totalDebitos());
        ContaInvestimento c2 = new ContaInvestimento(0.1, c1, hoje, 0.0);
        c2.aplicar(100.00);
        c2.resgatar(45.00);
        c2.aplicarRentabilidade(hoje);
        System.out.println("Saldo atual conta investimento: "+c2.getSaldo());
        System.out.println("Total de créditos conta investimento: "+c2.totalCreditos());
        System.out.println("Total de débitos conta investimento: "+c2.totalDebitos());
        System.out.println("Saldo atual conta corrente: "+c1.getSaldo());
        System.out.println("Total de créditos conta corrente: "+c1.totalCreditos());
        System.out.println("Total de débitos conta corrente: "+c1.totalDebitos());
        System.out.println("Saldo consolidado conta corrente: "+c1.saldoConsolidado());
        ContaInvestimento c3 = new ContaInvestimento(0.05, c1, hoje, 0.0);
        c3.aplicar(200.0);
        c3.resgatar(55.0);
        c3.aplicar(100.0);
        c3.aplicarRentabilidade(hoje);
        System.out.println("Saldo atual conta investimento: "+c3.getSaldo());
        System.out.println("Total de créditos conta investimento: "+c3.totalCreditos());
        System.out.println("Total de débitos conta investimento: "+c3.totalDebitos());
        System.out.println("Saldo atual conta corrente: "+c1.getSaldo());
        System.out.println("Total de créditos conta corrente: "+c1.totalCreditos());
        System.out.println("Total de débitos conta corrente: "+c1.totalDebitos());
        System.out.println("Saldo consolidado conta corrente: "+c1.saldoConsolidado());
        
        
        
        
        
        
    }
    
}
