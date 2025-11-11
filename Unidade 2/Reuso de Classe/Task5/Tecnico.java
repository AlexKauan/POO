public class Tecnico extends Assistente {
    private final double bonusMensal;

    public Tecnico(String nome, double salarioMensal, String matricula, double bonusMensal) {
        super(nome, salarioMensal, matricula);
        this.bonusMensal = bonusMensal;
    }

    public double getBonusMensal() {
        return bonusMensal;
    }

    @Override
    public double ganhoAnual() {
        double remuneracaoMensal = getSalarioMensal() + bonusMensal;
        return remuneracaoMensal * 12 + remuneracaoMensal;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nome='" + getNome() + '\'' +
                ", salarioMensal=" + getSalarioMensal() +
                ", matricula='" + getMatricula() + '\'' +
                ", bonusMensal=" + bonusMensal +
                '}';
    }
}

