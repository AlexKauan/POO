import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite n (n > 0): ");
        int n = scanner.nextInt();

        long anterior = 0;
        long atual = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(atual);
            System.out.print(i == n ? System.lineSeparator() : " ");

            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        scanner.close();
    }
}
