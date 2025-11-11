public class EventoDelegacao {
    private final DataHora dataHora;
    private final String descricao;

    public EventoDelegacao(DataHora dataHora, String descricao) {
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public DataHora getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "EventoDelegacao{" +
                "descricao='" + descricao + '\'' +
                ", dataHora=" + dataHora +
                '}';
    }
}

