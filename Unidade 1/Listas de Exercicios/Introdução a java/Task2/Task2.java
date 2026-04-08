import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double terceiroNumero = scanner.nextDouble();

        double soma = primeiroNumero + segundoNumero + terceiroNumero;
        double media = soma / 3.0;

        System.out.println(soma);
        System.out.println(media);

        scanner.close();
    }
}
