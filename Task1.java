import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner log = new Scanner(System.in);
        double lado,area,altura;

        System.out.println("Digite o lado e a altura do quadrado: ");
        lado = log.nextDouble();
        altura = log.nextDouble();

        area = lado * altura;

        System.out.println("A area do quadrado é " + area);

        log.close();
    }
}
