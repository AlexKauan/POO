package arraylist.task33;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<EntradaEmAgenda> entrada;

    public Agenda() {
        this.entrada = new ArrayList<EntradaEmAgenda>();
    }

    public void adicionarCompromisso(String hora, int dia, int mes, int ano, String assunto) {
        EntradaEmAgenda novoCompromisso = new EntradaEmAgenda(hora, ano, dia, mes, assunto);
        entrada.add(novoCompromisso);
    }

    public void listaDia(int dia, int mes, int ano) {
        for (EntradaEmAgenda item : entrada) {
            if (item.ehNoDia(dia, mes, ano)) {
                System.out.println(item);
            } else {
                System.out.println("Retornou false");
            }
        }
    }

    @Override
    public String toString() {
        return "Agenda [entrada=" + entrada + "]";
    }

}
