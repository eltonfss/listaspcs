package lista03.exercicio2;

public class Viagem {
    private TrechoViajem[] trechos;
    private Integer numeroDeTrechos;

    public Viagem(Integer numeroMaximoDeTrechos) {
        trechos = new TrechoViajem[numeroMaximoDeTrechos];
        numeroDeTrechos = 0;
    }
    
    public void adicionarTrecho(Double distanciaPercorrida,Double volumeDeCombustivelConsumido) throws Exception{
        if(numeroDeTrechos < trechos.length){
            trechos[numeroDeTrechos++] = new TrechoViajem(distanciaPercorrida, volumeDeCombustivelConsumido);
        }else{
            throw new Exception("Número de trechos excedido!");
        }
    }
    
    public Double getConsumoMedio(){
        Double consumoMedio = 0.0;
        for (TrechoViajem trechoViajem : trechos) {
            consumoMedio += trechoViajem.getConsumoMedio();
        }
        return consumoMedio/numeroDeTrechos;
    }
    
    public Double getDistanciaTotal(){
        Double distanciaTotal = 0.0;
        for (TrechoViajem trechoViajem : trechos) {
            distanciaTotal += trechoViajem.getDistanciaPercorrida();
        }
        return distanciaTotal;
    }
    
    public Double getVolumeCombustivelTotal(){
        Double volumerCombustivelTotal = 0.0;
        for (TrechoViajem trechoViajem : trechos) {
            volumerCombustivelTotal += trechoViajem.getVolumeCombustivel();
        }
        return volumerCombustivelTotal;
    }
    
    public Integer getNumeroTrechos(){
        return numeroDeTrechos;
    }
    
    public TrechoViajem[] getTrechos(){
        TrechoViajem[] trechosReal = new TrechoViajem[numeroDeTrechos];
        for (int i = 0; i < numeroDeTrechos; i++) {
            trechosReal[i] = trechos[i];
        }
        return trechosReal;
    }
    
}
