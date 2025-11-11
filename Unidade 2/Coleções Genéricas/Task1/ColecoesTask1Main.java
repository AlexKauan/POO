import java.util.LinkedList;
import java.util.List;

public class ColecoesTask1Main {
    public static void main(String[] args) {
        char[] dados = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J' };

        List<Character> original = new LinkedList<>();
        List<Character> invertida = new LinkedList<>();

        for (char caractere : dados) {
            original.add(caractere);
        }

        for (int i = dados.length - 1; i >= 0; i--) {
            invertida.add(dados[i]);
        }

        System.out.println("Original: " + original);
        System.out.println("Invertida: " + invertida);
    }
}
