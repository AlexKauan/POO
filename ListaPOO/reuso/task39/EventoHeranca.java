package reuso.task39;

public class EventoHeranca extends DataHora{
    private String eventoHeranca;

    public EventoHeranca(int dia, int ano, int mes, String hora, String eventoHeranca) {
        super(dia, ano, mes, hora);
        this.eventoHeranca = eventoHeranca;
    }

    @Override
    public String toString() {
        return "EventoHeranca [eventoHeranca=" + eventoHeranca + " " + super.toString() + "]";
    }

    

}
