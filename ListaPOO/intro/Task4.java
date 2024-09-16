package intro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        DecimalFormat parseInt = new DecimalFormat("0.0");
        double celsius, fahrenheit;

        System.out.println("Digite o grau para converter de Celsius para Fahrenheit.");
        System.out.printf("Graus: ");
        celsius = log.nextDouble();

        fahrenheit = (celsius * (9.0 / 5.0)) + 32;

        System.out.println(celsius + "°C " + "equivalem a " + parseInt.format(fahrenheit) + "°F" + " em fahrenheit");

        log.close();
    }
}
