public class Task1 {
    public static void main(String[] args) {
        Time time = new Time("Potiguar FC", "Futebol", "Campeonato Estadual");
        time.registrarResultados(5, 2, 1);

        time.exibirResumo();
    }
}
