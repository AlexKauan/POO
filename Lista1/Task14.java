import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = log.nextInt();

        if(n <= 0){
            System.out.println("O valor de n deve ser maior que 0.");
        }else{
            long fistTerm = 0;
            long secondTerm = 1;

            System.out.print("Serie de Fibonacci ate o " + n + "Termo: ");

            for (int i = 1; i <= n; i++) {
                System.out.print(fistTerm + " ");

                long proximoTermo = fistTerm + secondTerm;
                fistTerm = secondTerm;
                secondTerm = proximoTermo;
        }

    }
        log.close();
}
}
