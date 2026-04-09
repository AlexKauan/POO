public class Task2 {
    public static void main(String[] args) {
        Contador contador = new Contador();

        System.out.print("Valor inicial: ");
        contador.imprimir();

        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        System.out.print("Depois de incrementar 3 vezes: ");
        contador.imprimir();

        contador.zerar();
        System.out.print("Depois de zerar: ");
        contador.imprimir();
    }
}
