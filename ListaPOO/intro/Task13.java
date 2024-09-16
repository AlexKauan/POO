package intro;

public class Task13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 60; i++) {
            System.out.printf("%2d ", i);
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
