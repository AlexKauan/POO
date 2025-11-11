public class Administrativo extends Assistente {
    private final String turno;
    private final double adicionalNoturno;

    public Administrativo(String nome, double salarioMensal, String matricula, String turno, double adicionalNoturno) {
        super(nome, salarioMensal, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        boolean turnoNoturno = "noite".equalsIgnoreCase(turno);
        double mensal = getSalarioMensal() + (turnoNoturno ? adicionalNoturno : 0);
        return mensal * 12 + getSalarioMensal();
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nome='" + getNome() + '\'' +
                ", salarioMensal=" + getSalarioMensal() +
                ", matricula='" + getMatricula() + '\'' +
                ", turno='" + turno + '\'' +
                ", adicionalNoturno=" + adicionalNoturno +
                '}';
    }
}

