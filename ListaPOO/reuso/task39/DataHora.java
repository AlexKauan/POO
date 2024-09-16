package reuso.task39;

public class DataHora {
    private int dia;
    private int ano;
    private int mes;
    private String hora;


    public DataHora(int dia, int ano, int mes, String hora) {
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
        this.hora = hora;
    }


    @Override
    public String toString() {
        return "DataHora [dia = " + dia + ", ano = " + ano + ", mes = " + mes + ", hora = " + hora + "]";
    }
  
}
