package lista04.exercicio2;

public class Paralelepipedo extends Solido{

    private double altura;
    private double comprimento;
    private double largura;

    public Paralelepipedo(double altura, double comprimento, double largura) {
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    
    
    @Override
    public double getVolume() {
        return altura*comprimento*largura;
    }
    
}
