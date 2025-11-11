public class Assistente extends Funcionario {
    private final String matricula;

    public Assistente(String nome, double salarioMensal, String matricula) {
        super(nome, salarioMensal);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Assistente{" +
                "nome='" + getNome() + '\'' +
                ", salarioMensal=" + getSalarioMensal() +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

