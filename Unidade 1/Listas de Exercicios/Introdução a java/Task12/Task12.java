import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia (1 a 28): ");
        int diaDoMes = scanner.nextInt();

        if (diaDoMes < 1 || diaDoMes > 28) {
            System.out.println("Dia invalido");
            scanner.close();
            return;
        }

        String diaDaSemana = obterDiaDaSemana(diaDoMes);
        String artigo = (diaDaSemana.equals("domingo") || diaDaSemana.equals("sabado")) ? "um" : "uma";

        System.out.println("O dia " + diaDoMes + " sera " + artigo + " " + diaDaSemana + ".");

        scanner.close();
    }

    private static String obterDiaDaSemana(int diaDoMes) {
        int indice = (diaDoMes - 1) % 7;

        return switch (indice) {
            case 0 -> "domingo";
            case 1 -> "segunda-feira";
            case 2 -> "terca-feira";
            case 3 -> "quarta-feira";
            case 4 -> "quinta-feira";
            case 5 -> "sexta-feira";
            default -> "sabado";
        };
    }
}
