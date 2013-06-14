package lista03.exercicio4;

public class Ponto {
    private Integer x;
    private Integer y;

    public Ponto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public void setX(Integer x) throws Exception{
        if(x > 0)
            this.x = x;
        else
            throw new Exception("X não pode ser negativo!");
    }

    public void setY(Integer y) throws Exception{
        if(y > 0)
            this.y = y;
        else
            throw new Exception("Y não pode ser negativo!");
    }
    
}
