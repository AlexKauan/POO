import java.util.Random;

public class Task5Main {
    public static void main(String[] args) {
        final int totalLancamentos = 36_000_000;
        int[] somas = new int[13];
        Random random = new Random();

        for (int i = 0; i < totalLancamentos; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            somas[dado1 + dado2]++;
        }

        for (int soma = 2; soma <= 12; soma++) {
            System.out.println("Soma " + soma + ": " + somas[soma]);
        }
    }
}

