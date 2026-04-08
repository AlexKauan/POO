public class Task1 {
    public static void main(String[] args) {
        Equipe equipe = new Equipe("Tigres FC");
        equipe.registrarVitoria();
        equipe.registrarEmpate();
        equipe.registrarDerrota();

        System.out.println("Time: " + equipe.getNome());
        System.out.println("Vitórias: " + equipe.getVitorias());
        System.out.println("Empates: " + equipe.getEmpates());
        System.out.println("Derrotas: " + equipe.getDerrotas());
        System.out.println("Pontos: " + equipe.getPontos());
    }
}
