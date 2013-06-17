package lista04.exercicio4;

public class EmpregadoBonificado extends EmpregadoAssalariado{
    
    private Double bonus;

    public EmpregadoBonificado(Double bonus, Double salarioBase, Double desconto, String nome) {
        super(salarioBase, desconto, nome);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        if(bonus < 1 && bonus > 0)
            this.bonus = bonus;
        else
            System.out.println("Bônus inválido! Bônus deve ser um valor entre 0 e 1.");
    }

    @Override
    public Double getPagamentoLiquido() {
        return super.getPagamentoLiquido()*(1+bonus);
    }

    @Override
    public String getRegime() {
        return "Bonificado";
    }
    
}
