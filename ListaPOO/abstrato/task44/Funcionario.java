package abstrato.task44;

public class Funcionario {
    private String nome;
    private String cargo;
    private int horasTrabalhadas;
    private double salarioHora;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioHora = 2;
    }

    public Funcionario(String nome, double salarioHora) {
        this.nome = nome;
        this.salarioHora = salarioHora;
    }

    public double salario(int horasTrabalhadas) {
        return horasTrabalhadas * salarioHora;
    }
}