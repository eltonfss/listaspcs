package lista04.exercicio3;

import java.text.DecimalFormat;

public class FolhaPagamento {

    private Empregado[] empregados;

    public FolhaPagamento() {
        empregados = new Empregado[6];
        empregados[0] = new EmpregadoHorista(10.00, 120, "João");
        empregados[1] = new EmpregadoAssalariado(1650.00, 0.10, "Maria");
        empregados[2] = new EmpregadoBonificado(0.10, 1650.00, 0.10, "Marcos");
        empregados[3] = new EmpregadoHorista(10.00, 120, "Jorge");
        empregados[4] = new EmpregadoAssalariado(1650.00, 0.10, "Marcia");
        empregados[5] = new EmpregadoBonificado(0.10, 1650.00, 0.10, "Carlos");
    }
    
    public void imprimir(){
        System.out.println("-- Folha de Pagamento --");
        DecimalFormat df = new DecimalFormat("#,###.00");  
        for (Empregado empregado : empregados) {
            System.out.println("Nome: "+empregado.getNome());
            System.out.println("Regime de Trabalho: "+empregado.getClass().getName().replace("Empregado", ""));
            System.out.println("Pagamento Líquido: "+df.format(empregado.getSalarioLiquido()));
        }
    }
    
    
    
}
