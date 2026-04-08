public class Equipe {
    private String nome;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void registrarVitoria() {
        vitorias++;
    }

    public void registrarEmpate() {
        empates++;
    }

    public void registrarDerrota() {
        derrotas++;
    }

    public int getPontos() {
        return vitorias * 3 + empates;
    }

    public String getNome() {
        return nome;
    }

    public int getVitorias() {
        return vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
}
