import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite m: ");
        long m = scanner.nextLong();
        System.out.print("Digite n: ");
        long n = scanner.nextLong();

        long resultado = mdc(m, n);
        System.out.println(resultado);

        scanner.close();
    }

    private static long mdc(long m, long n) {
        if (n > m) {
            return mdc(n, m);
        }
        if (n == 0) {
            return m;
        }
        return mdc(n, m % n);
    }
}
