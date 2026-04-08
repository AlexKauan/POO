import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da carta (1 a 13): ");
        int valor = scanner.nextInt();

        System.out.print("Digite o naipe (1 = ouros, 2 = paus, 3 = copas, 4 = espadas): ");
        int naipe = scanner.nextInt();

        String nomeValor = obterNomeDoValor(valor);
        String nomeNaipe = obterNomeDoNaipe(naipe);

        if (nomeValor == null || nomeNaipe == null) {
            System.out.println("Carta Invalida");
        } else {
            System.out.println(nomeValor + " de " + nomeNaipe);
        }

        scanner.close();
    }

    private static String obterNomeDoValor(int valor) {
        return switch (valor) {
            case 1 -> "As";
            case 2 -> "Dois";
            case 3 -> "Tres";
            case 4 -> "Quatro";
            case 5 -> "Cinco";
            case 6 -> "Seis";
            case 7 -> "Sete";
            case 8 -> "Oito";
            case 9 -> "Nove";
            case 10 -> "Dez";
            case 11 -> "Valete";
            case 12 -> "Dama";
            case 13 -> "Rei";
            default -> null;
        };
    }

    private static String obterNomeDoNaipe(int naipe) {
        return switch (naipe) {
            case 1 -> "Ouros";
            case 2 -> "Paus";
            case 3 -> "Copas";
            case 4 -> "Espadas";
            default -> null;
        };
    }
}
