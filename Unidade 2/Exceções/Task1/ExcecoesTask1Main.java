import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesTask1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int primeiro = obterIntValido(scanner, "Informe o primeiro numero: ");
            int segundo = obterIntValido(scanner, "Informe o segundo numero: ");
            System.out.println("Soma: " + (primeiro + segundo));
        } finally {
            scanner.close();
        }
    }

    private static int obterIntValido(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Digite um numero inteiro.");
                scanner.nextLine();
            }
        }
    }
}
