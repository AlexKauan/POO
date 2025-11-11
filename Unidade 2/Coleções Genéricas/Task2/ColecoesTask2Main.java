import java.util.Map;
import java.util.TreeMap;

public class ColecoesTask2Main {
    public static void main(String[] args) {
        String texto = "HELLO THERE";
        Map<Character, Integer> contagens = new TreeMap<>();

        for (char c : texto.toUpperCase().toCharArray()) {
            if (Character.isLetter(c)) {
                contagens.merge(c, 1, Integer::sum);
            }
        }

        contagens.forEach((letra, quantidade) -> System.out.println(letra + ": " + quantidade));
    }
}
