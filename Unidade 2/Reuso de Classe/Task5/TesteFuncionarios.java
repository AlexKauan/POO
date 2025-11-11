public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario analista = new Funcionario("Renata", 4500);
        Assistente assistente = new Assistente("Paulo", 3200, "A123");
        Tecnico tecnico = new Tecnico("Lucia", 3500, "T321", 400);
        Administrativo administrativo = new Administrativo("Marcos", 3000, "AD456", "noite", 250);

        analista.aumentarSalario(300);

        System.out.println(analista);
        System.out.println("Ganho anual: " + analista.ganhoAnual());
        System.out.println(assistente);
        System.out.println("Ganho anual: " + assistente.ganhoAnual());
        System.out.println(tecnico);
        System.out.println("Ganho anual: " + tecnico.ganhoAnual());
        System.out.println(administrativo);
        System.out.println("Ganho anual: " + administrativo.ganhoAnual());
    }
}

