package lista04.exercicio2;

import com.sun.org.apache.bcel.internal.generic.IMPDEP1;

public class Main {
    
    public static void main(String[] args) {
        Solido[] solidos = new Solido[4];
        solidos[0] = new Esfera(3);
        solidos[1] = new Esfera(10);
        solidos[2] = new Paralelepipedo(10, 10, 10);
        solidos[3] = new Paralelepipedo(3, 3, 3);
        imprimir(solidos);
    }
    
    public static void imprimir(Solido[] solidos){
        double volumeTotal = 0.0;
        double massaTotal = 0.0;
        for (Solido solido : solidos) {
            System.out.println("Volume: "+solido.getVolume());
            System.out.println("Tipo: "+solido.getClass());
            System.out.println("Massa: "+solido.getMassa());
            volumeTotal += solido.getVolume();
            massaTotal += solido.getMassa();
        }
        
        System.out.println("Volumer total: "+volumeTotal);
        System.out.println("Massa total: "+massaTotal);
    }
    
}
