import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> compromissos;

    public Agenda() {
        this.compromissos = new ArrayList<EntradaEmAgenda>();
    }

    public void adicionarCompromisso(EntradaEmAgenda entrada) {
        compromissos.add(entrada);
    }

    public void listaDia(int dia, int mes, int ano) {
        System.out.println("Compromissos para " + dia + "/" + mes + "/" + ano + ":");
        System.out.println("================================================");

        boolean encontrouCompromissos = false;

        for (EntradaEmAgenda entrada : compromissos) {
            if (entrada.ehNoDia(dia, mes, ano)) {
                System.out.println(entrada);
                encontrouCompromissos = true;
            }
        }

        if (!encontrouCompromissos) {
            System.out.println("Nenhum compromisso encontrado para esta data.");
        }

        System.out.println("================================================");
    }
}
