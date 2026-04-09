public class Lampada {
    private boolean estadoDaLampada;
    private Contador vezesAcesa;

    public Lampada() {
        this.estadoDaLampada = false;
        this.vezesAcesa = new Contador();
    }

    public void acende() {
        if (!estadoDaLampada) {
            estadoDaLampada = true;
            vezesAcesa.incrementar();
        }
    }

    public void apaga() {
        estadoDaLampada = false;
    }

    public void mostraEstado() {
        if (estadoDaLampada) {
            System.out.println("A lampada esta acesa.");
        } else {
            System.out.println("A lampada esta apagada.");
        }
    }

    public boolean estaLigada() {
        return estadoDaLampada;
    }

    public void mostraVezesAcesa() {
        System.out.println("A lampada foi acesa " + vezesAcesa + " vezes.");
    }
}
