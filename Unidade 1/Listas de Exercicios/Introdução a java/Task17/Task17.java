public class Task17 {
    public static void main(String[] args) {
        double populacaoA = 7000;
        double populacaoB = 20000;

        double taxaCrescimentoA = 0.035;
        double taxaCrescimentoB = 0.01;

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }

        System.out.println(anos);
    }
}
