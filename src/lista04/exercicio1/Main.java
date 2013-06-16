package lista04.exercicio1;

public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[2];
        produtos[0] = new Produto("sabonete",1.80);
        produtos[1] = new ProdutoEspecial(0.10, "cerveja", 2.00);
        Produto produtoDeMaiorPreco = null;
        for (Produto produto : produtos) {
            if(produtoDeMaiorPreco == null || produto.getPreco()>produtoDeMaiorPreco.getPreco())
                produtoDeMaiorPreco = produto;
            else if(produto.getPreco() == produtoDeMaiorPreco.getPreco()) 
                produtoDeMaiorPreco = null;
            System.out.println("Produto: "+produto.getNome()+" Preço: "+produto.getPreco());
        }
        if(produtoDeMaiorPreco != null)
            System.out.println("Produto de maior preço: "+produtoDeMaiorPreco.getNome());
        else
            System.out.println("Os preços dos produtos são iguais!");
        
    }
    
}
