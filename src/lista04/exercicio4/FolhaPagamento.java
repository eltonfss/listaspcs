package lista04.exercicio4;

import java.text.DecimalFormat;

public class FolhaPagamento {

    private IElementoFolha[] elementosFolha;

    public FolhaPagamento() {
        elementosFolha = new IElementoFolha[8];
        elementosFolha[0] = new EmpregadoHorista(10.00, 120, "João");
        elementosFolha[1] = new EmpregadoAssalariado(1650.00, 0.10, "Maria");
        elementosFolha[2] = new EmpregadoBonificado(0.10, 1650.00, 0.10, "Marcos");
        elementosFolha[3] = new EmpregadoHorista(10.00, 120, "Jorge");
        elementosFolha[4] = new EmpregadoAssalariado(1650.00, 0.10, "Marcia");
        elementosFolha[5] = new EmpregadoBonificado(0.10, 1650.00, 0.10, "Carlos");
        elementosFolha[6] = new Empresa("Microsof", 1000000.00, 0.10, 0.25);
        elementosFolha[7] = new Empresa("Apple", 1005000.00, 0.10, 0.30);
    }
    
    public void imprimir(){
        System.out.println("-- Folha de Pagamento --");
        DecimalFormat df = new DecimalFormat("#,###.00");  
        for (IElementoFolha elementoFolha : elementosFolha) {
            System.out.println("Nome: "+elementoFolha.getNome());
            System.out.println("Regime de Trabalho: "+elementoFolha.getRegime());
            System.out.println("Pagamento Líquido: "+df.format(elementoFolha.getPagamentoLiquido()));
        }
    }
    
    
    
}
