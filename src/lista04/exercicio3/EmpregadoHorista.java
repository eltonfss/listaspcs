package lista04.exercicio3;

public class EmpregadoHorista extends Empregado{
    
    private Double valorHora;
    private Integer numeroDeHorasTrabalhadas;
    private final Double TAXA = 200.00; // ou 100?

    public EmpregadoHorista(Double valorHora, Integer numeroDeHorasTrabalhadas, String nome) {
        super(nome);
        this.valorHora = valorHora;
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    }

    public Integer getNumeroDeHorasTrabalhadas() {
        return numeroDeHorasTrabalhadas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    @Override
    public Double getSalarioLiquido() {
        return (valorHora*numeroDeHorasTrabalhadas)-TAXA;
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNumeroDeHorasTrabalhadas(Integer numeroDeHorasTrabalhadas) {
        this.numeroDeHorasTrabalhadas = numeroDeHorasTrabalhadas;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
}
