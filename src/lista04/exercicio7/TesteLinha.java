package lista04.exercicio7;

public class TesteLinha {
    
    public static void main(String[] args) {
        Locomotiva l1 = new Locomotiva(50);
        Locomotiva l2 = new Locomotiva(30);
        Vagao[] vagoes = {new Vagao(10, 10),new Vagao(10, 20),new Vagao(10, 20)};
        Vagao v1 = new Vagao(20, 20);
        RecursoFerroviario[] recursosDoTrem = new RecursoFerroviario[] {l1,vagoes[0],vagoes[1],vagoes[2]};
        Trem trem = new Trem(recursosDoTrem);
        RecursoFerroviario[] recursosEstacionados = new RecursoFerroviario[] {l2,v1,trem};
        LinhaFerroviaria linha = new LinhaFerroviaria(1, recursosEstacionados);
        System.out.println("Ocupação da linha = "+linha.getOcupacao());
    }
    
}
