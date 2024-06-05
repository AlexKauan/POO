import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);

        System.out.print("Digite o valor em minutos: ");
        int totalMinutos = log.nextInt();

        int dias = totalMinutos / 1440;
        int horas = (totalMinutos % 1440) / 60;
        int minutos = totalMinutos % 60;

        System.out.println(totalMinutos + " minutos = " + dias + " dias, " + horas + " horas e " + minutos + " minutos.");

        log.close();
    }
}
