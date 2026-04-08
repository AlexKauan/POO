import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite n (n >= 0): ");
        int n = scanner.nextInt();

        fatorial(n, 0);

        scanner.close();
    }

    private static long fatorial(int n, int nivel) {
        long resultado;
        if (n == 0) {
            resultado = 1;
            imprimirLinha(nivel, n, resultado);
            return resultado;
        }

        resultado = n * fatorial(n - 1, nivel + 1);
        imprimirLinha(nivel, n, resultado);
        return resultado;
    }

    private static void imprimirLinha(int nivel, int n, long valor) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("\t");
        }
        System.out.println(n + "! = " + valor);
    }
}
