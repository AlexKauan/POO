import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;

        System.out.println(area);
        scanner.close();
    }
}
