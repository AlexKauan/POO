package genericas.task50;

import java.util.Stack;

public class Main {

    public static boolean isBalanced(String texto) {
        Stack<Character> stack = new Stack<>();

        for (char index : texto.toCharArray()) {
            if (index == '(') {
                stack.push(index);
            } else if (index == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String[] texto = { "(()))", "(((())))", "(()((())()))", "((((((()", "(()))", "(()()(())" };

        for (String index : texto) {
            if (isBalanced(index)) {
                System.out.println(index + " esta balanceada.");
            } else {
                System.out.println(index + " nao esta balanceada.");
            }
        }
    }
}
