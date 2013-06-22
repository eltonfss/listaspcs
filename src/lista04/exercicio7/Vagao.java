package lista04.exercicio7;

public class Vagao implements RecursoFerroviario{
    
    private int comprimentoTesteiras;
    private int comprimentoEngates;

    public Vagao(int comprimentoTesteiras, int comprimentoEngates) {
        this.comprimentoTesteiras = comprimentoTesteiras;
        this.comprimentoEngates = comprimentoEngates;
    }

    public int getComprimentoEngates() {
        return comprimentoEngates;
    }

    public int getComprimentoTesteiras() {
        return comprimentoTesteiras;
    }

    public void setComprimentoEngates(int comprimentoEngates) {
        this.comprimentoEngates = comprimentoEngates;
    }

    public void setComprimentoTesteiras(int comprimentoTesteiras) {
        this.comprimentoTesteiras = comprimentoTesteiras;
    }

    @Override
    public int getOcupacao() {
        return this.getComprimentoEngates()+this.getComprimentoTesteiras();
    }
    
}
