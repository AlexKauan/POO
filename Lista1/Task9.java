import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);

        String[] ouros = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        String[] paus = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        String[] copas = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};
        String[] espadas = {"Ás", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"};


        System.out.println("Digite o valor da carta (de 1 a 13):");
        int valorCarta = log.nextInt();
        System.out.println("Digite o naipe da carta (1 = ouros, 2 = paus, 3 = copas, 4 = espadas):");
        int naipeCarta = log.nextInt();

        String[] cartas = null;
        switch (naipeCarta) {
            case 1:
                cartas = ouros;
                System.out.println(cartas[valorCarta - 1] + " " +"De " + "Ouros");
                break;
            case 2:
                cartas = paus;
                System.out.println(cartas[valorCarta - 1] + " " +"De " + "Paus");
                break;
            case 3:
                cartas = copas;
                System.out.println(cartas[valorCarta - 1] + " " +"De " + "Copas");
                break;
            case 4:
                cartas = espadas;
                System.out.println(cartas[valorCarta - 1] + " " +"De " + "Espadas");
                break;
            default:
                System.out.println("Naipe inválido.");
                return;
        }
        log.close();
    }
}
