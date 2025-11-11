public class Main {
        public static void main(String[] args) {
                Agenda minhaAgenda = new Agenda();

                EntradaEmAgenda compromisso1 = new EntradaEmAgenda(14, 15, 3, 2025,
                                "Festa de aniversário");
                EntradaEmAgenda compromisso2 = new EntradaEmAgenda(10, 15, 3, 2025,
                                "Almoço em família");
                EntradaEmAgenda compromisso3 = new EntradaEmAgenda(9, 20, 10, 2025,
                                "Reunião de trabalho");

                minhaAgenda.adicionarCompromisso(compromisso1);
                minhaAgenda.adicionarCompromisso(compromisso2);
                minhaAgenda.adicionarCompromisso(compromisso3);

                minhaAgenda.listaDia(15, 3, 2025);

                System.out.println("\n");
                minhaAgenda.listaDia(20, 10, 2025);
        }
}
