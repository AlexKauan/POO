package genericas.task48;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> lista1 = new LinkedList<>();

        lista1.add('C');
        lista1.add('O');
        lista1.add('C');
        lista1.add('A');
        lista1.add('-');
        lista1.add('C');
        lista1.add('O');
        lista1.add('L');
        lista1.add('A');

        System.out.println("Lista Original: " + lista1);

        LinkedList<Character> lista2 = new LinkedList<>();

        for (int i = lista1.size() - 1; i >= 0; i--) {
            lista2.add(lista1.get(i));
        }
        System.out.println("Lista Invertida: " + lista2);
    }
}
