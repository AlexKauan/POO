import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 3 dígitos (CDU): ");
        int numero = scanner.nextInt();

        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int numeroUcd = (unidade * 100) + (centena * 10) + dezena;

        System.out.println(numeroUcd);

        scanner.close();
    }
}
