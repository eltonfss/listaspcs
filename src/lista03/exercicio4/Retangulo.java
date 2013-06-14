package lista03.exercicio4;

public class Retangulo {
    
    private Ponto topLeft;
    private Ponto bottomRight;

    public Retangulo() {
        topLeft = new Ponto(0, 0);
        bottomRight = new Ponto(0, 0);
    }

    public Retangulo(Ponto topLeft, Ponto bottomRight) {
        //bottomRight
        if(bottomRight.getX() > topLeft.getX()){
            if(bottomRight.getY() < topLeft.getY()){
                this.bottomRight = bottomRight;
            }else{
                System.out.println("topLeft ("+topLeft.getX()+","+topLeft.getY()+") e bottomRight("+bottomRight.getX()+","+bottomRight.getY()+") => "+bottomRight.getY()+" é maior que "+topLeft.getY()+" => valor inválido para bottomRight.");
                this.bottomRight = new Ponto(topLeft.getX()+1, topLeft.getY()-1);
            }
        }else{
            System.out.println("topLeft ("+topLeft.getX()+","+topLeft.getY()+") e bottomRight("+bottomRight.getX()+","+bottomRight.getY()+") => "+bottomRight.getX()+" é menor que "+topLeft.getX()+" => valor inválido para bottomRight.");
            this.bottomRight = new Ponto(topLeft.getX()+1, topLeft.getY()-1);
        }

        //topLeft
        setTopLeft(topLeft);
    }

    public Ponto getBottomRight() {
        return bottomRight;
    }

    public Ponto getTopLeft() {
        return topLeft;
    }

    public void setBottomRight(Ponto bottomRight) {
        if(bottomRight.getX() > topLeft.getX()){
            if(bottomRight.getY() < topLeft.getY()){
                this.bottomRight = bottomRight;
            }else{
                System.out.println("topLeft ("+topLeft.getX()+","+topLeft.getY()+") e bottomRight("+bottomRight.getX()+","+bottomRight.getY()+") => "+bottomRight.getY()+" é maior que "+topLeft.getY()+" => valor inválido para bottomRight.");
                this.bottomRight = new Ponto(topLeft.getX()+1, topLeft.getY()-1);
            }
        }else{
            System.out.println("topLeft ("+topLeft.getX()+","+topLeft.getY()+") e bottomRight("+bottomRight.getX()+","+bottomRight.getY()+") => "+bottomRight.getX()+" é menor que "+topLeft.getX()+" => valor inválido para bottomRight.");
            this.bottomRight = new Ponto(topLeft.getX()+1, topLeft.getY()-1);
        }
    }

    public void setTopLeft(Ponto topLeft) {
        if(bottomRight.getX() > topLeft.getX()){
            if(bottomRight.getY() < topLeft.getY()){
                this.topLeft = topLeft;
            }else{
                System.out.println("topLeft ("+topLeft.getX()+","+topLeft.getY()+") e bottomRight("+bottomRight.getX()+","+bottomRight.getY()+") => "+bottomRight.getY()+" é maior que "+topLeft.getY()+" => valor inválido para topLeft.");
                this.topLeft = new Ponto(bottomRight.getX()-1, bottomRight.getY()+1);
            }
        }else{
            System.out.println("topLeft ("+topLeft.getX()+","+topLeft.getY()+") e bottomRight("+bottomRight.getX()+","+bottomRight.getY()+") => "+bottomRight.getX()+" é menor que "+topLeft.getX()+" => valor inválido para topLeft.");
            this.topLeft = new Ponto(bottomRight.getX()-1, bottomRight.getY()+1);
        }
    }
    
    public Integer comprimento(){
        return Math.abs(bottomRight.getX()-topLeft.getX());
    }
    
    public Integer largura(){
        return Math.abs(bottomRight.getY()-topLeft.getY());
    }
    
    public Integer area(){
        return largura()*comprimento();
    }
    
    public Integer perimetro(){
        return (2*largura())+(2*comprimento());
    }

   
    
    
    
}
