import java.util.Locale;

public class Time {
    private String nome;
    private String esporte;
    private String campeonato;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Time(String nome, String esporte, String campeonato) {
        this.nome = nome;
        this.esporte = esporte;
        this.campeonato = campeonato;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }

    public void registrarResultados(int vitorias, int empates, int derrotas) {
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public int calcularPontos() {
        return (vitorias * 3) + empates;
    }

    public void exibirResumo() {
        int jogos = vitorias + empates + derrotas;
        int pontos = calcularPontos();
        double aproveitamento = jogos == 0 ? 0.0 : (pontos * 100.0) / (jogos * 3.0);

        System.out.println();
        System.out.println("=== Resumo do Time ===");
        System.out.println("Nome: " + nome);
        System.out.println("Esporte: " + esporte);
        System.out.println("Campeonato: " + campeonato);
        System.out.println("Jogos: " + jogos);
        System.out.println("Vitorias: " + vitorias);
        System.out.println("Empates: " + empates);
        System.out.println("Derrotas: " + derrotas);
        System.out.println("Pontos: " + pontos);
        System.out.printf(Locale.US, "Aproveitamento: %.2f%%%n", aproveitamento);
    }
}
