public class Task13 {
    public static void main(String[] args) {
        int numerosPorLinha = 6;
        int totalNumeros = 60;

        for (int numero = 1; numero <= totalNumeros; numero++) {
            boolean ultimaColuna = (numero % numerosPorLinha == 0);

            System.out.printf("%02d", numero);
            System.out.print(ultimaColuna ? System.lineSeparator() : " ");
        }
    }
}
