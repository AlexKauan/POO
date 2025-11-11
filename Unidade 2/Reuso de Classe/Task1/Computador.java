public class Computador extends Equipamento {
    private String processador;
    private int memoriaRamGb;

    public Computador(String modelo, String fabricante, String processador, int memoriaRamGb) {
        super(modelo, fabricante);
        this.processador = processador;
        this.memoriaRamGb = memoriaRamGb;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRamGb() {
        return memoriaRamGb;
    }

    public void setMemoriaRamGb(int memoriaRamGb) {
        this.memoriaRamGb = memoriaRamGb;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "modelo='" + getModelo() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", processador='" + processador + '\'' +
                ", memoriaRamGb=" + memoriaRamGb +
                '}';
    }
}

