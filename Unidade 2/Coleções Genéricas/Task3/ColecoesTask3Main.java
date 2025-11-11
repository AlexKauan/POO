import java.util.ArrayDeque;
import java.util.Deque;

public class ColecoesTask3Main {
    public static void main(String[] args) {
        String[] exemplos = {
                "(()()()())",
                "(((())))",
                "(()((())()))",
                "((((((())",
                "()))",
                "(()()(()"
        };

        for (String exemplo : exemplos) {
            boolean balanceada = estaBalanceada(exemplo);
            System.out.println(exemplo + " -> " + (balanceada ? "balanceada" : "nao balanceada"));
        }
    }

    private static boolean estaBalanceada(String texto) {
        Deque<Character> pilha = new ArrayDeque<>();

        for (char c : texto.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    return false;
                }
                pilha.pop();
            }
        }

        return pilha.isEmpty();
    }
}

