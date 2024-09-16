package arraylist.task34;

public class DemoMatriz {
    public static void main(String[] args) {
        float[][] valores = {
                { 2, 3 },
                { 5, 7 }
        };

        Matriz matriz = new Matriz(valores);

        System.out.println("Matriz:");
        matriz.imprimirMatriz();

        float determinante = matriz.calcularDeterminante();
        System.out.println("Determinante: " + determinante);
    }
}
