package lista04.exercicio4;

public class EmpregadoAssalariado extends Empregado{
    
    private Double salarioBase;
    private Double desconto;

    public EmpregadoAssalariado(Double salarioBase, Double desconto, String nome) {
        super(nome);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
    }

    public Double getDesconto() {
        return desconto;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public Double getPagamentoLiquido() {
        return salarioBase*(1-desconto);
    }

    public void setDesconto(Double desconto) {
        if(desconto < 1 && desconto > 0)
            this.desconto = desconto;
        else
            System.out.println("Desconto inválido! Desconto deve ser um valor entre 0 e 1.");
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String getRegime() {
        return "Assalariado";
    } 

}
