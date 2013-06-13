package lista03.exercicio2;

public class TrechoViajem {
    private Double distanciaPercorrida;
    private Double volumeCombustivel;

    public TrechoViajem(Double distanciaPercorrida, Double volumeCombustivel) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.volumeCombustivel = volumeCombustivel;
    }

    public Double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(Double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public Double getVolumeCombustivel() {
        return volumeCombustivel;
    }

    public void setVolumeCombustivel(Double volumeCombustivel) {
        this.volumeCombustivel = volumeCombustivel;
    }
    
    public Double getConsumoMedio(){
        return distanciaPercorrida/volumeCombustivel;
    }
}
