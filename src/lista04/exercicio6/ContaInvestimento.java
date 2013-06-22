package lista04.exercicio6;

import java.util.Date;
import lista03.exercicio3.Data;

public class ContaInvestimento extends Conta{
    private Double taxaRentabilidade;
    private ContaCorrente contaCorrente;

    public ContaInvestimento(Double taxaRentabilidade, ContaCorrente contaCorrente, Data dataDeAbertura, double saldo) {
        super(dataDeAbertura, saldo);
        this.taxaRentabilidade = taxaRentabilidade;
        this.contaCorrente = contaCorrente;
        contaCorrente.vincularConta(this);
    }

    public Double getTaxaRentabilidade() {
        return taxaRentabilidade;
    }

    public void setTaxaRentabilidade(Double taxaRentabilidade) {
        this.taxaRentabilidade = taxaRentabilidade;
    }
    
    public void aplicar(Double valor){
        Date data = new Date();
        this.registrarMovimentacao(new Data(data.getDay(), data.getMonth(), data.getYear()), valor);
        this.contaCorrente.registrarMovimentacao(new Data(data.getDay(), data.getMonth(), data.getYear()), -valor);
    }
    
    public void resgatar(Double valor){
        Date data = new Date();
        this.registrarMovimentacao(new Data(data.getDay(), data.getMonth(), data.getYear()), -valor);
        this.contaCorrente.registrarMovimentacao(new Data(data.getDay(), data.getMonth(), data.getYear()), valor);
    }
    
    public void aplicarRentabilidade(Data data){
        this.registrarMovimentacao(data, saldo*taxaRentabilidade);
    }
    
}
