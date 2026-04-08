import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        long n = scanner.nextLong();

        boolean primo = ehPrimo(n);
        System.out.println(primo);

        scanner.close();
    }

    private static boolean ehPrimo(long n) {
        if (n <= 1) {
            return false;
        }
        return verificaPrimo(n, 2);
    }

    private static boolean verificaPrimo(long n, long d) {
        if (d > n / d) {
            return true;
        }
        if (n % d == 0) {
            return false;
        }
        return verificaPrimo(n, d + 1);
    }
}
