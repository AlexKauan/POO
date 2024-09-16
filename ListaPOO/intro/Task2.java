package intro;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite as notas do aluno");
        System.out.printf("Nota 1: ");
        nota1 = log.nextDouble();
        System.out.printf("Nota 2: ");
        nota2 = log.nextDouble();
        System.out.printf("Nota 3: ");
        nota3 = log.nextDouble();

        media = media(nota1, nota2, nota3);

        System.out.println("A media do aluno é: " + media);
        log.close();
    }

    public static double media(double num1, double num2, double num3) {
        double soma = num1 + num2 + num3;
        double m = soma / 3;

        return m;
    }
}
