import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesTask2Main {
    private static final String[] MESES = {
            "Janeiro", "Fevereiro", "Marco", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um numero de 1 a 12: ");
            try {
                int indice = scanner.nextInt();
                try {
                    System.out.println("Mes: " + MESES[indice - 1]);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Indice fora da faixa. Digite entre 1 e 12.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Informe um numero inteiro.");
            }
        } finally {
            scanner.close();
        }
    }
}
