package lista04.exercicio6;

import lista03.exercicio3.Data;

public class ContaCorrente extends Conta{
    private String nomeCorrentista;
    private ContaInvestimento[] contasInvestimento;
    private final Integer numeroMaximoDeContasInvestimento = 5;
    private Integer numeroDeContasInvestimento;

    public ContaCorrente(String nomeCorrentista, Data dataDeAbertura, double saldo) {
        super(dataDeAbertura, saldo);
        this.nomeCorrentista = nomeCorrentista;
        contasInvestimento = new ContaInvestimento[numeroMaximoDeContasInvestimento];
        numeroDeContasInvestimento = 0;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }
    
    public double saldoConsolidado(){
        double saldoConsolidado = this.saldo;
        for (int i = 0; i < numeroDeContasInvestimento; i++) {
            saldoConsolidado += contasInvestimento[i].getSaldo();
        }
        return saldoConsolidado;
    }
    
    public void vincularConta(ContaInvestimento contaInvestimento){
        if(numeroDeContasInvestimento < numeroMaximoDeContasInvestimento){
            contasInvestimento[numeroDeContasInvestimento++] = contaInvestimento;
        }else{
            System.out.println("Número máximo de contas de invesimento excedido!");
        }
    }
    
}
