import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);

        System.out.print("Digite um número de três dígitos (CDU): ");
        int numero = log.nextInt();

        int centena = numero / 100;
        int resto = numero % 100;
        int dezena = resto / 10;
        int unidade = resto % 10;

        int numeroReescrito = unidade * 100  + centena * 10 + dezena;

        System.out.println("Número invertido: " + numeroReescrito);

        log.close();
    }
}
