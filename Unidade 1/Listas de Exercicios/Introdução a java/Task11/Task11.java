import java.util.Locale;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Digite y1: ");
        double y1 = scanner.nextDouble();

        System.out.print("Digite x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Digite y2: ");
        double y2 = scanner.nextDouble();

        boolean imprimiuAlgumaDirecao = false;

        if (y2 > y1) {
            System.out.println("O segundo ponto esta acima do primeiro.");
            imprimiuAlgumaDirecao = true;
        } else if (y2 < y1) {
            System.out.println("O segundo ponto esta abaixo do primeiro.");
            imprimiuAlgumaDirecao = true;
        }

        if (x2 > x1) {
            System.out.println("O segundo ponto esta a direita do primeiro.");
            imprimiuAlgumaDirecao = true;
        } else if (x2 < x1) {
            System.out.println("O segundo ponto esta a esquerda do primeiro.");
            imprimiuAlgumaDirecao = true;
        }

        if (!imprimiuAlgumaDirecao) {
            System.out.println("Os dois pontos sao iguais.");
        }

        scanner.close();
    }
}
