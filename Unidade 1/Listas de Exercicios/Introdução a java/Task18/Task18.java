import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (>= 1): ");
        int expoente = scanner.nextInt();

        long resultado = potencia(base, expoente);
        System.out.println(resultado);

        scanner.close();
    }

    private static long potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        }

        return base * potencia(base, expoente - 1);
    }
}
