public class Funcionario {
    private final String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void aumentarSalario(double aumento) {
        salarioMensal += aumento;
    }

    public double ganhoAnual() {
        return salarioMensal * 12 + salarioMensal;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioMensal=" + salarioMensal +
                '}';
    }
}

