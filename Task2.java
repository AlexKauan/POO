import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner log = new Scanner(System.in);

        float nota1,nota2,nota3, media;

        System.out.println("Digite as notas do aluno");
        System.out.printf("Nota 1: ");
        nota1 = log.nextFloat();
        System.out.printf("Nota 2: ");
        nota2 = log.nextFloat();
        System.out.printf("Nota 3: ");
        nota3 = log.nextFloat();

        media = (nota1 + nota2 + nota3)/3;

        System.out.println("A media do aluno é: " + media);
        log.close();
    }
}
