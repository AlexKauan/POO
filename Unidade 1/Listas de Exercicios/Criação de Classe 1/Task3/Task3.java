import java.util.Locale;

public class Task3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Aluno alunoAprovado = new Aluno("2024001", "Ana", 8.0, 7.5, 9.0);
        Aluno alunoFinal = new Aluno("2024002", "Bruno", 5.0, 4.0, 6.0);
        Aluno alunoReprovado = new Aluno("2024003", "Carla", 1.5, 2.0, 2.0);

        exibirResultado(alunoAprovado);
        exibirResultado(alunoFinal);
        exibirResultado(alunoReprovado);
    }

    private static void exibirResultado(Aluno aluno) {
        double mp = aluno.media();
        double efNecessario = aluno.provaFinal();

        System.out.println("=== Aluno ===");
        System.out.println("Matricula: " + aluno.getMatricula());
        System.out.println("Nome: " + aluno.getNome());
        System.out.printf("Media parcial (MP): %.2f%n", mp);

        if (mp >= 7.0) {
            System.out.println("Situacao: aprovado sem exame final.");
        } else if (mp < 3.0) {
            System.out.println("Situacao: reprovado sem exame final.");
        } else {
            System.out.printf("Precisa tirar no minimo %.2f no exame final.%n", efNecessario);
        }

        System.out.println();
    }
}
