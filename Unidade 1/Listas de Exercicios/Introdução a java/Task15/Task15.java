public class Task15 {
    public static void main(String[] args) {
        int encontrados = 0;
        int numero = 2;

        while (encontrados < 4) {
            if (ehPerfeito(numero)) {
                System.out.println(numero);
                encontrados++;
            }
            numero++;
        }
    }

    private static boolean ehPerfeito(int numero) {
        int somaDivisores = 1;

        for (int divisor = 2; divisor * divisor <= numero; divisor++) {
            if (numero % divisor == 0) {
                somaDivisores += divisor;

                int outroDivisor = numero / divisor;
                if (outroDivisor != divisor) {
                    somaDivisores += outroDivisor;
                }
            }
        }

        return numero > 1 && somaDivisores == numero;
    }
}
