public class Matriz2x2 {
    private final float[][] valores;

    public Matriz2x2(float a11, float a12, float a21, float a22) {
        valores = new float[][] {
                { a11, a12 },
                { a21, a22 }
        };
    }

    public float determinante() {
        return valores[0][0] * valores[1][1] - valores[0][1] * valores[1][0];
    }

    public void imprimir() {
        System.out.println("[" + valores[0][0] + " " + valores[0][1] + "]");
        System.out.println("[" + valores[1][0] + " " + valores[1][1] + "]");
    }
}