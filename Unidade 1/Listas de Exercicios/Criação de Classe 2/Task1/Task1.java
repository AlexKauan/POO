public class Task1 {
    public static void main(String[] args) {
        java.util.Locale.setDefault(java.util.Locale.US);

        Elevador e = new Elevador(3, 5);
        System.out.println("Inicial: " + e);

        e.entra();
        e.entra();
        e.entra();
        e.entra();
        System.out.println("Depois de entrar: " + e);

        e.sai();
        e.sai();
        e.sai();
        e.sai();
        System.out.println("Depois de sair: " + e);

        e.entra();
        e.entra();
        System.out.println("Com pessoas: " + e);

        e.sobe();
        e.sobe();
        e.sobe();
        e.sobe();
        e.sobe();
        e.sobe();
        System.out.println("Topo: " + e);

        e.desce();
        e.desce();
        e.desce();
        e.desce();
        e.desce();
        e.desce();
        System.out.println("Terreo: " + e);
    }
}
