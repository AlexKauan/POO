public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void zerar() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void imprimir() {
        System.out.println(valor);
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
