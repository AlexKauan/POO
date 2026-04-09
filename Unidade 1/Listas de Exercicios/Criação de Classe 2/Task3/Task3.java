public class Task3 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.mostraEstado();
        lampada.mostraVezesAcesa();

        lampada.acende();
        lampada.acende();
        lampada.mostraEstado();
        lampada.mostraVezesAcesa();

        System.out.println("Esta ligada? " + lampada.estaLigada());

        lampada.apaga();
        lampada.mostraEstado();
        lampada.mostraVezesAcesa();

        lampada.acende();
        lampada.mostraEstado();
        lampada.mostraVezesAcesa();
    }
}
