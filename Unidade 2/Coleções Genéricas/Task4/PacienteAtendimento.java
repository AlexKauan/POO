import java.util.Random;

public class PacienteAtendimento {
    private final int rg;
    private final int idade;

    public PacienteAtendimento(int rg, int idade) {
        this.rg = rg;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public boolean ehPrioritario() {
        return idade >= 60;
    }

    public static PacienteAtendimento gerar(Random random) {
        int rg = 10000000 + random.nextInt(90000000);
        int idade = 1 + random.nextInt(100);
        return new PacienteAtendimento(rg, idade);
    }

    @Override
    public String toString() {
        return "Paciente{rg=" + rg + ", idade=" + idade + "}";
    }
}

