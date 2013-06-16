package lista04.exercicio2;

public abstract class Solido {
    protected double densidade;

    public abstract double getVolume();
    
    public double getMassa(){
       return getVolume()*densidade;
    }
    
}
