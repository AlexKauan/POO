public class Equipamento {
    private String modelo;
    private String fabricante;

    public Equipamento(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Equipamento{" +
                "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}

