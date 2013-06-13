package lista03.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Empregado> empregados = new ArrayList<Empregado>();
        Empregado e = new Empregado();
        e.setNome("Teste1");
        e.setAltura(1.75);
        e.setSalarioBase(1000.00);
        e.setTaxaPercentualDesconto(0.10);
        empregados.add(e);
        empregados.add(new Empregado("Teste2", 5000.00, 0.027, 1.80));
        for (Empregado empregado : empregados) {
            System.out.println("Nome: "+empregado.getNome());
            System.out.println("Pagamento Líquido: "+empregado.getPagamentoLiquido());
        }
    }
    
}
