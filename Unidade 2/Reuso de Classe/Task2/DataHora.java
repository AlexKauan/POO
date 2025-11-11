public class DataHora {
    private final int dia;
    private final int mes;
    private final int ano;
    private final int hora;
    private final int minuto;

    public DataHora(int dia, int mes, int ano, int hora, int minuto) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d %02d:%02d", dia, mes, ano, hora, minuto);
    }
}

