package lista04.exercicio4;

public class Empresa implements IElementoFolha{
    
    private String nome;
    private Double valorBruto;
    private Double taxaIR;
    private Double taxaISS;

    public Empresa(String nome, Double valorBruto, Double taxaIR, Double taxaISS) {
        this.nome = nome;
        this.valorBruto = valorBruto;
        this.taxaIR = taxaIR;
        this.taxaISS = taxaISS;
    }
    
    @Override
    public Double getPagamentoLiquido() {
        return getValorBruto()*(1-getTaxaIR()-getTaxaISS());
    }

    @Override
    public String getRegime() {
        return "Pessoa Jurídica";
    }

    @Override
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valorBruto
     */
    public Double getValorBruto() {
        return valorBruto;
    }

    /**
     * @param valorBruto the valorBruto to set
     */
    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

    /**
     * @return the taxaIR
     */
    public Double getTaxaIR() {
        return taxaIR;
    }

    /**
     * @param taxaIR the taxaIR to set
     */
    public void setTaxaIR(Double taxaIR) {
        this.taxaIR = taxaIR;
    }

    /**
     * @return the taxaISS
     */
    public Double getTaxaISS() {
        return taxaISS;
    }

    /**
     * @param taxaISS the taxaISS to set
     */
    public void setTaxaISS(Double taxaISS) {
        this.taxaISS = taxaISS;
    }
    
    
}
