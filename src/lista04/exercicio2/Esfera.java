package lista04.exercicio2;

public class Esfera extends Solido{

    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double getVolume() {
        return (4.0/3.0)*Math.PI*Math.pow(raio, 3);
    }
    
}
