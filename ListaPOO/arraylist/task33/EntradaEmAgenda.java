package arraylist.task33;

public class EntradaEmAgenda {
    private String hora;
    private int ano;
    private int dia;
    private int mes;
    private String assunto;

    public EntradaEmAgenda(String hora, int ano, int dia, int mes, String assunto) {
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "EntradaEmAgenda [hora=" + hora + ", ano=" + ano + ", dia=" + dia + ", mes=" + mes + ", assunto="
                + assunto + "]";
    }

    public boolean ehNoDia(int dia, int mes, int ano) {
        if (this.dia == dia && this.mes == mes && this.ano == ano) {
            return true;
        } else {
            return false;
        }

    }

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
}
