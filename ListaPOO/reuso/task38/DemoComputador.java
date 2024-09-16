package reuso.task38;

public class DemoComputador {
    public static void main(String[] args) {
        Equipamento equip1 = new Equipamento("Rusky 4500k", "Acer");
        Computador pc = new Computador(equip1, "Intel core I9", "Nvidia GTX 4080 TI");


        System.out.println(equip1);
        System.out.println(pc);
    }
}
