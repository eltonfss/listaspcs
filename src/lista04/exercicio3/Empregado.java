package lista04.exercicio3;

public abstract class Empregado {
    
    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public abstract Double getSalarioLiquido();
    
    
}
