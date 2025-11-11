public class EventoHeranca extends DataHora {
    private final String descricao;

    public EventoHeranca(int dia, int mes, int ano, int hora, int minuto, String descricao) {
        super(dia, mes, ano, hora, minuto);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "EventoHeranca{" +
                "descricao='" + descricao + '\'' +
                ", dataHora=" + super.toString() +
                '}';
    }
}

