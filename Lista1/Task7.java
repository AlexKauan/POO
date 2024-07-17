import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        Scanner log = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Digite três números: ");
        n1 = log.nextInt();
        n2 = log.nextInt();
        n3 = log.nextInt();

        if(n1 > n2){
            if(n1 > n3){
                System.out.printf("O maior número é: " + n1);
            }else{
                System.out.printf("O maior número é: " + n3);
            }
        }else if(n2 > n3){
            System.out.printf("O maior número é: " + n2);
        }else{
            System.out.printf("O maior número é: " + n3);
        }
        log.close();
    }
}
