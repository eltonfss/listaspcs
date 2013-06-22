package lista04.exercicio7;

public class Trem implements RecursoFerroviario{

    private RecursoFerroviario[] recursosDoTrem;

    public Trem(RecursoFerroviario[] recursosDoTrem) {
        this.recursosDoTrem = recursosDoTrem;
    }

    public RecursoFerroviario[] getRecursosDoTrem() {
        return recursosDoTrem;
    }

    public void setRecursosDoTrem(RecursoFerroviario[] recursosDoTrem) {
        this.recursosDoTrem = recursosDoTrem;
    }
    
    @Override
    public int getOcupacao() {
        int ocupacao = 0;
        for (RecursoFerroviario recursoFerroviario : recursosDoTrem) {
            ocupacao += recursoFerroviario.getOcupacao();
        }
        return ocupacao;
    }
    
}
