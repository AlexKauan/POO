import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o intervalo em minutos: ");
        int totalMinutos = scanner.nextInt();

        int minutosPorDia = 24 * 60;
        int minutosPorHora = 60;

        int dias = totalMinutos / minutosPorDia;
        int minutosRestantesAposDias = totalMinutos % minutosPorDia;

        int horas = minutosRestantesAposDias / minutosPorHora;
        int minutos = minutosRestantesAposDias % minutosPorHora;

        System.out.println(dias + " dias, " + horas + " horas e " + minutos + " minutos");

        scanner.close();
    }
}
