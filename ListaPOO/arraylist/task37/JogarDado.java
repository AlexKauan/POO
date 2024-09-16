package arraylist.task37;

public class JogarDado {
    private int[] soma;
    private int result;

    public JogarDado(int result) {
        soma = new int[13];
        this.result = result;
    }

    public void lance() {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();

        for (int i = 0; i < result; i++) {
            int sum = dado1.rolar() + dado2.rolar();
            soma[sum]++;
        }
    }

    public void exibirSomas() {
        System.out.println("Soma\tFrequência");
        for (int i = 2; i < soma.length; i++) {
            System.out.printf("%d\t%d%n", i, soma[i]);
        }
    }
}
