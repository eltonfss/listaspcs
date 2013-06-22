package lista04.exercicio6;

import lista04.exercicio5.*;
import lista03.exercicio3.Data;

public abstract class Conta{
    protected Data dataDeAbertura;
    protected double saldo;
    protected Movimentacao[] movimentacoes;
    protected final Integer numeroMaximoDeMovimentacoes = 100;
    protected Integer numeroDeMovimentacoesEfetuadas;

    public Conta(Data dataDeAbertura, double saldo) {
        this.dataDeAbertura = dataDeAbertura;
        this.saldo = saldo;
        movimentacoes = new Movimentacao[numeroMaximoDeMovimentacoes];
        numeroDeMovimentacoesEfetuadas = 0;
    }

    /**
     * @return the dataDeAbertura
     */
    public Data getDataDeAbertura() {
        return dataDeAbertura;
    }

    /**
     * @param dataDeAbertura the dataDeAbertura to set
     */
    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void registrarMovimentacao(Data data, Double valor){
        if(numeroDeMovimentacoesEfetuadas < 100){
            if(data.getAno() >= dataDeAbertura.getAno() && data.getMes() >= dataDeAbertura.getMes() && data.getDia() >= dataDeAbertura.getDia()){
                movimentacoes[numeroDeMovimentacoesEfetuadas++] = new Movimentacao(data, valor);
                saldo += valor;
            }else{
                System.out.println("Data da movimentação não pode ser anterior a data de abertura da conta!");
            }
        }else{
            System.out.println("Número máximo de movimentações excedido!");
        }
    }
    
    public Double totalDebitos(){
        Double totalDebitos = 0.0;
        for (int i = 0; i < numeroDeMovimentacoesEfetuadas; i++) {
            if(movimentacoes[i].getValorDaMovimentacao() < 0){
                totalDebitos += movimentacoes[i].getValorDaMovimentacao();
            }
        }
        return totalDebitos;
    }
    
    public Double totalCreditos(){
        Double totalCreditos = 0.0;
        for (int i = 0; i < numeroDeMovimentacoesEfetuadas; i++) {
            if(movimentacoes[i].getValorDaMovimentacao() > 0){
                totalCreditos += movimentacoes[i].getValorDaMovimentacao();
            }
        }
        return totalCreditos;
    }
    
}
