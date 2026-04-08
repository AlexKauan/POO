public class Task3 {
    public static void main(String[] args) {
        Aluno a = new Aluno("2026001", "Maria", 6.0, 5.0, 7.0);
        System.out.println("Aluno: " + a.getMatricula() + " - " + a.getNome());
        double mp = a.media();
        System.out.println("MP: " + mp);
        System.out.println("EF necessária: " + a.provaFinal());
    }
}
