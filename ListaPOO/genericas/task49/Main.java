package genericas.task49;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Character, Integer> mapa = new TreeMap<>();

        String texto = "coca cola";
        char letras;
        int qtd = 0;

        for (int i = 0; i < texto.length(); i++) {
            letras = texto.charAt(i);
            if (letras != ' ' && mapa.containsKey(letras)) {
                qtd = mapa.get(letras);
                mapa.put(letras, qtd + 1);

            } else if (letras != ' ' && !mapa.containsKey(letras)) {
                mapa.put(letras, 1);
            }
        }

        for (Character string : mapa.keySet()) {
            System.out.println(string + ": " + mapa.get(string));
        }
    }
}
