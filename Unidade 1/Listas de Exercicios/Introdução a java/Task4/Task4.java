import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite a temperatura em Celsius: ");
        double temperaturaEmCelsius = scanner.nextDouble();
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 9.0 / 5.0) + 32.0;

        System.out.println(temperaturaEmFahrenheit);

        scanner.close();
    }
}
