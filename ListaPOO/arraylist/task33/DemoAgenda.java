package arraylist.task33;

public class DemoAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.adicionarCompromisso("19:30", 28, 5, 2014, "Aniversario Alex");
        agenda.adicionarCompromisso("19:30", 28, 6, 2024, "Aniversario Pedro");

        agenda.listaDia(28, 5, 2014);
        agenda.listaDia(28, 6, 2024);

        System.out.println(agenda);

    }
}
