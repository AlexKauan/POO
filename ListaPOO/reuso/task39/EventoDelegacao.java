package reuso.task39;

public class EventoDelegacao {
    private DataHora data;
    private String evento;


    public EventoDelegacao(String evento, int dia, int ano, int mes, String hora) {
        this.data = new DataHora(dia,mes,ano,hora);
        this.evento = evento;
    }


    @Override
    public String toString() {
        return "EventoDelegacao [data =" + data.toString() + ", evento = " + evento + "]";
    }

}
