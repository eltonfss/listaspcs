package lista04.exercicio7;

public class LinhaFerroviaria implements RecursoFerroviario{

    private int numero;
    private RecursoFerroviario[] recursosEstacionados;

    public LinhaFerroviaria(int numero, RecursoFerroviario[] recursosEstacionados) {
        this.numero = numero;
        this.recursosEstacionados = recursosEstacionados;
    }

    public int getNumero() {
        return numero;
    }

    public RecursoFerroviario[] getRecursosEstacionados() {
        return recursosEstacionados;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRecursosEstacionados(RecursoFerroviario[] recursosEstacionados) {
        this.recursosEstacionados = recursosEstacionados;
    }

    @Override
    public int getOcupacao() {
        int ocupacao = 0;
        for (RecursoFerroviario recursoFerroviario : recursosEstacionados) {
            ocupacao += recursoFerroviario.getOcupacao();
        }
        return ocupacao;
    }
    
    
    
}
