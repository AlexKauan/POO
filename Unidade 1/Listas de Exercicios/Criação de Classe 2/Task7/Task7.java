public class Task7 {
    public static void main(String[] args) {
        Trio<Integer> t1 = new Trio<>(10, 10, 5);
        Trio<String> t2 = new Trio<>("a", "b", "c");
        Trio<Double> t3 = new Trio<>(2.5, 2.5, 2.5);

        System.out.println("Trio<Integer> iguais: " + t1.quantosIguais());
        t1.imprimir();
        System.out.println();

        System.out.println("Trio<String> iguais: " + t2.quantosIguais());
        t2.imprimir();
        System.out.println();

        System.out.println("Trio<Double> iguais: " + t3.quantosIguais());
        t3.imprimir();
    }
}
