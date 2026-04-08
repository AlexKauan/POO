import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o ângulo em graus: ");
        double anguloEmGraus = scanner.nextDouble();
        double anguloEmRadianos = Math.toRadians(anguloEmGraus);

        double seno = Math.sin(anguloEmRadianos);
        double cosseno = Math.cos(anguloEmRadianos);
        double tangente = Math.tan(anguloEmRadianos);

        double cossecante = 1.0 / seno;
        double secante = 1.0 / cosseno;
        double cotangente = 1.0 / tangente;

        System.out.println("radianos: " + anguloEmRadianos);
        System.out.println("seno: " + seno);
        System.out.println("cosseno: " + cosseno);
        System.out.println("tangente: " + tangente);
        System.out.println("cossecante: " + cossecante);
        System.out.println("secante: " + secante);
        System.out.println("cotangente: " + cotangente);

        scanner.close();
    }
}
