package arraylist.task36;

import java.util.ArrayList;

public class Produto {
    public int produto(int... numeros) {
        int aux = 1;

        for (int numero : numeros) {
            aux *= numero;
        }

        return aux;
    }

}
