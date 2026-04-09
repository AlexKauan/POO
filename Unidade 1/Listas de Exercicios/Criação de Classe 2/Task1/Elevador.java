public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoas;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = Math.max(0, capacidade);
        this.totalAndares = Math.max(0, totalAndares);
        this.andarAtual = 0;
        this.pessoas = 0;
    }

    public void entra() {
        if (pessoas < capacidade) {
            pessoas++;
        }
    }

    public void sai() {
        if (pessoas > 0) {
            pessoas--;
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
        }
    }

    @Override
    public String toString() {
        return String.format(java.util.Locale.US, "Andar: %d/%d | Pessoas: %d/%d", andarAtual, totalAndares, pessoas, capacidade);
    }
}
