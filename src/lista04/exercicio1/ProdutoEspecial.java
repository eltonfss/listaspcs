package lista04.exercicio1;

public class ProdutoEspecial extends Produto{
    
    private double desconto;

    public ProdutoEspecial(double desconto, String nome, double preco) {
        super(nome, preco);
        this.setDesconto(desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto > 0 && desconto < 1)
            this.desconto = desconto;
        else
            System.out.println("Desconto inválido!");
    }    

    @Override
    public double getPreco() {
        return preco*(1-desconto);
    }

}
