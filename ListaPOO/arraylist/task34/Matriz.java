package arraylist.task34;

public class Matriz {

    private float[][] matriz;

    public Matriz(float[][] valores) {
        if (valores.length != 2 || valores[0].length != 2 || valores[1].length != 2) {
            throw new IllegalArgumentException("A matriz deve ter tamanho 2x2.");
        }
        this.matriz = valores;
    }

    public float calcularDeterminante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    public void imprimirMatriz() {
        System.out.println("[" + matriz[0][0] + " " + matriz[0][1] + "]");
        System.out.println("[" + matriz[1][0] + " " + matriz[1][1] + "]");
    }

}
