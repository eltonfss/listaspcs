package lista03.exercicio1;

public class Empregado {
    
    private String nome;
    private Double salarioBase;
    private Double taxaPercentualDesconto;
    private Double altura;

    /**
     * a) construtor default com taxa percentual de desconto = 10%.
     */
    public Empregado() {
        salarioBase = 0.0;
        taxaPercentualDesconto = 0.10;
        altura = 0.0;
        nome = "";
    }

    /**
     * b) construtor com nome, altura, salário e taxa percentual.
     * @param nome
     * @param salarioBase
     * @param taxaPercentualDesconto
     * @param altura 
     */
    public Empregado(String nome, Double salarioBase, Double taxaPercentualDesconto, Double altura) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.taxaPercentualDesconto = taxaPercentualDesconto;
        this.altura = altura;
    }

    /**
     * c) métodos get e set para os atributos.
     */
    
    /**
     * @return the nome
     */
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
     * @return the salarioBase
     */
    public Double getSalarioBase() {
        return salarioBase;
    }

    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    /**
     * @return the taxaPercentualDesconto
     */
    public Double getTaxaPercentualDesconto() {
        return taxaPercentualDesconto;
    }

    /**
     * @param taxaPercentualDesconto the taxaPercentualDesconto to set
     */
    public void setTaxaPercentualDesconto(Double taxaPercentualDesconto) {
        this.taxaPercentualDesconto = taxaPercentualDesconto;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    /**
     * d) método getPagamentoLiquido sendo o resultado do cálculo: salário descontado da
taxa percentual.
     * @return 
     */
    public Double getPagamentoLiquido(){
        return salarioBase*(1-taxaPercentualDesconto);
    }
    
    
    
    
    
    
    
    
}
