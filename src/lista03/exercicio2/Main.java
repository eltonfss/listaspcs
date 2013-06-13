package lista03.exercicio2;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Entrada");
            System.out.print("Entre número de trechos:");
            Integer numeroMaximoDeTrechos = scanner.nextInt();
            Viagem viagem = new Viagem(numeroMaximoDeTrechos);
            Double distanciaPercorrida;
            Double volumeCombustivel;
            for(int i = 1; i <= numeroMaximoDeTrechos; i++){
                System.out.print("Entre distância percorrida (em km):");
                distanciaPercorrida = scanner.nextDouble();
                System.out.print("Entre quantidade de combustível (em litros):");
                volumeCombustivel = scanner.nextDouble();
                viagem.adicionarTrecho(distanciaPercorrida, volumeCombustivel);
            }
            System.out.println("Saída");
            int i = 1;
            for (TrechoViajem trecho : viagem.getTrechos()) {
                System.out.println("Trecho "+i+": "+trecho.getDistanciaPercorrida().intValue()+" km e "+trecho.getVolumeCombustivel()+" litros – Consumo: "+trecho.getConsumoMedio().intValue()+" km/l");
                i++;
            }
            System.out.println("Distância Total: "+viagem.getDistanciaTotal().intValue()+" km");
            System.out.println("Volume Combustível Total: "+viagem.getVolumeCombustivelTotal().intValue()+" litros");
            System.out.println("Consumo Médio: "+viagem.getConsumoMedio()+" km/l");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
