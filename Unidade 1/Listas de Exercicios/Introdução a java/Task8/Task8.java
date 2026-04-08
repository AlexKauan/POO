import java.util.Locale;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite o código do setor: ");
        int codigoSetor = scanner.nextInt();

        System.out.print("Digite o valor do produto: ");
        double valorOriginal = scanner.nextDouble();

        if (codigoSetor == 222) {
            double valorComDesconto = valorOriginal;
            if (valorOriginal > 500.0) {
                valorComDesconto = valorOriginal * 0.90;
            }

            System.out.println("Setor: Eletros");
            System.out.println("Valor com desconto: " + valorComDesconto);
        } else if (codigoSetor == 111) {
            double valorComDesconto;
            if (valorOriginal > 100.0) {
                valorComDesconto = valorOriginal * 0.60;
            } else if (valorOriginal >= 50.0) {
                valorComDesconto = valorOriginal * 0.80;
            } else {
                valorComDesconto = valorOriginal * 0.90;
            }

            System.out.println("Setor: Cama, mesa e banho");
            System.out.println("Valor com desconto: " + valorComDesconto);
        } else {
            System.out.println("Setor Invalido");
        }

        scanner.close();
    }
}
