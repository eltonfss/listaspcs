package lista04.exercicio7;

public class Locomotiva implements RecursoFerroviario{
    
    private int comprimento;

    public Locomotiva(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getOcupacao() {
        return this.getComprimento();
    }
    
}
