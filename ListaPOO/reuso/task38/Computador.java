package reuso.task38;

public class Computador {
    private Equipamento equip1;
    private String processador;
    private String placaDeVideo;

    public Computador(Equipamento equip1, String processador, String placaDeVideo) {
        this.equip1 = equip1;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
    }

    @Override
    public String toString() {
        return "Computador [" + equip1 + ", processador = " + processador
                + ", placaDeVideo = " + placaDeVideo + "]";
    }

    
}
