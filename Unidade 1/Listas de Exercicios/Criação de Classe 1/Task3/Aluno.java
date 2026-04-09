public class Aluno {
    private String matricula;
    private String nome;
    private double p1;
    private double p2;
    private double t;

    public Aluno(String matricula, String nome, double p1, double p2, double t) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.t = t;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double media() {
        return ((2.5 * p1) + (2.5 * p2) + (2.0 * t)) / 7.0;
    }

    public double provaFinal() {
        double mp = media();

        if (mp < 3.0 || mp >= 7.0) {
            return 0.0;
        }

        return (50.0 - (6.0 * mp)) / 4.0;
    }
}
