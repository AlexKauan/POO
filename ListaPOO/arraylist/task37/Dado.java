package arraylist.task37;

import java.util.Random;

public class Dado {
    private Random random;

    public Dado() {
        random = new Random();
    }

    public int rolar() {
        return 1 + random.nextInt(6);
    }

}
