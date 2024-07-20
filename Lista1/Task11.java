import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if (y2 > y1) {
            System.out.println("O segundo ponto está acima do primeiro ponto.");
        } else if (y2 < y1) {
            System.out.println("O segundo ponto está abaixo do primeiro ponto.");
        } else {
            System.out.println("O segundo ponto está na mesma altura do primeiro ponto.");
        }

        if (x2 > x1) {
            System.out.println("O segundo ponto está à direita do primeiro ponto.");
        } else if (x2 < x1) {
            System.out.println("O segundo ponto está à esquerda do primeiro ponto.");
        } else {
            System.out.println("O segundo ponto está na mesma linha vertical do primeiro ponto.");
        }

        scanner.close();
    }
}

