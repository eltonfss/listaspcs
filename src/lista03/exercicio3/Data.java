package lista03.exercicio3;

public class Data {
    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data(Integer dia, Integer mes, Integer ano) {
        try{
            this.setAno(ano);
            this.setDia(dia);
            this.setMes(mes);
        }catch(Exception e){
            this.ano = 1980;
            this.dia = 01;
            this.mes = 01;
        }
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) throws Exception{
        if(ano >= 1980)
            this.ano = ano;
        else
            throw new Exception("Ano inválido!");
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) throws Exception{
        if(dia > 0 && dia <= 31)
            this.dia = dia;
        else
            throw new Exception("Dia inválido!");
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) throws Exception{
        if(mes > 0 && mes <= 12)
            this.mes = mes;
        else
            throw new Exception("Mês inválido!");
    }
    
    public Integer diaDaSemana(){
        if(mes < 3){
           mes += 12;
           ano -= 1;
        }
        return (dia+(2 * mes)+(int) (6 * (mes + 1) / 10) + ano + (int) (ano / 4) - (int) (ano / 100) + (int) (ano / 400) + 1) % 7;
    }
}
