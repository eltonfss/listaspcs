package lista04.exercicio5;

import lista03.exercicio3.Data;

public class Movimentacao {
    private Data dataDaMovimentacao;
    private Double valorDaMovimentacao;

    public Movimentacao(Data dataDaMovimentacao, Double valorDaMovimentacao) {
        this.dataDaMovimentacao = dataDaMovimentacao;
        this.valorDaMovimentacao = valorDaMovimentacao;
    }

    /**
     * @return the dataDaMovimentacao
     */
    public Data getDataDaMovimentacao() {
        return dataDaMovimentacao;
    }

    /**
     * @param dataDaMovimentacao the dataDaMovimentacao to set
     */
    public void setDataDaMovimentacao(Data dataDaMovimentacao) {
        this.dataDaMovimentacao = dataDaMovimentacao;
    }

    /**
     * @return the valorDaMovimentacao
     */
    public Double getValorDaMovimentacao() {
        return valorDaMovimentacao;
    }

    /**
     * @param valorDaMovimentacao the valorDaMovimentacao to set
     */
    public void setValorDaMovimentacao(Double valorDaMovimentacao) {
        this.valorDaMovimentacao = valorDaMovimentacao;
    }
    
}
