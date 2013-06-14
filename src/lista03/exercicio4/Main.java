package lista03.exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrada:");
        System.out.print("\tTopLeft.x => ");
        Integer topLeftX = scanner.nextInt();
        System.out.print("\tTopLeft.y => ");
        Integer topLeftY = scanner.nextInt();
        System.out.print("\tBottomRight.x => ");
        Integer bottomRightX = scanner.nextInt();
        System.out.print("\tBottomRight.y => ");
        Integer bottomRightY = scanner.nextInt();
        Retangulo retangulo = new Retangulo(new Ponto(topLeftX, topLeftY), new Ponto(bottomRightX, bottomRightY));
        System.out.println("Saida:");
        System.out.println("Retangulo:");
        System.out.println("\tComprimento = "+retangulo.comprimento());
        System.out.println("\tLargura = "+retangulo.largura());
        System.out.println("\tÀrea = "+retangulo.area());
        System.out.println("\tPerímetro = "+retangulo.perimetro());
        
        System.out.println("Digite um número:");
        Integer n = scanner.nextInt();
        Retangulo[] retangulos = new Retangulo[n];
        for (int i = 1; i <= n; i++) {
            retangulos[i-1] = new Retangulo(new Ponto(0, 0), new Ponto(i, i));
        }
        imprimir(retangulos);
    }
    
    public static void imprimir(Retangulo[] retangulos){
        Integer i = 1;
        Integer areaTotal = 0;
        Integer perimetroTotal = 0;
        for (Retangulo retangulo : retangulos) {
            System.out.println("Retangulo "+i);
            System.out.println("\tÁrea: "+retangulo.area());
            System.out.println("\tPerímetro: "+retangulo.perimetro());
            areaTotal += retangulo.area();
            perimetroTotal += retangulo.perimetro();
            i++;
        }
        System.out.println("Área Total: "+areaTotal);
        System.out.println("Perímetro Total:"+perimetroTotal);
    }
    
}
