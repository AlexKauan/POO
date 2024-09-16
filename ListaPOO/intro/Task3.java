package intro;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        double graus, radianos, seno, cosseno, tangente, cossecante, secante, cotangente;

        System.out.printf("Digite um ângulo em graus: ");
        graus = log.nextDouble();
        radianos = Math.toRadians(graus);
        seno = Math.sin(radianos);
        cosseno = Math.cos(radianos);
        tangente = Math.tan(radianos);
        cossecante = 1 / seno;
        secante = 1 / cosseno;
        cotangente = 1 / tangente;

        System.out.println("Ângulo em radianos: " + radianos);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Secante: " + secante);
        System.out.println("Cotangente: " + cotangente);

        log.close();

    }
}
