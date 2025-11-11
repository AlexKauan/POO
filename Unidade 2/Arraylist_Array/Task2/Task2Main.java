public class Task2Main {
    public static void main(String[] args) {
        Matriz2x2 matriz = new Matriz2x2(4f, 2f, 1f, 3f);
        matriz.imprimir();
        System.out.println("Determinante: " + matriz.determinante());
    }
}
