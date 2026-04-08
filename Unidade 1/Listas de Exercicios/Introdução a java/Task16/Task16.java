public class Task16 {
    public static void main(String[] args) {
        for (int numero = 100; numero <= 999; numero++) {
            if (ehNumeroArmstrongDeTresDigitos(numero)) {
                System.out.println(numero);
            }
        }
    }

    private static boolean ehNumeroArmstrongDeTresDigitos(int numero) {
        int centena = numero / 100;
        int dezena = (numero / 10) % 10;
        int unidade = numero % 10;

        int somaDosCubos = cubo(centena) + cubo(dezena) + cubo(unidade);
        return somaDosCubos == numero;
    }

    private static int cubo(int valor) {
        return valor * valor * valor;
    }
}
