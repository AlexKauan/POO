import java.util.Locale;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite n: ");
        int n = scanner.nextInt();

        double[] coeficientes = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        System.out.print("Digite x: ");
        double x = scanner.nextDouble();

        double resultado = pn(n, coeficientes, x);
        System.out.println(resultado);

        scanner.close();
    }

    private static double pn(int n, double[] a, double x) {
        if (n == 0) {
            return a[0];
        }
        return x * pn(n - 1, a, x) + a[n];
    }
}
