public class CalculadoraProduto {
    public static long produto(int... valores) {
        long resultado = 1;
        for (int valor : valores) {
            resultado *= valor;
        }
        return resultado;
    }
}

