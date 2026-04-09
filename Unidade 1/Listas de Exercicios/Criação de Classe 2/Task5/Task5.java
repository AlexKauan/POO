import java.util.Locale;

public class Task5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("int (2): " + Maior.maior(10, 7));
        System.out.println("int (3): " + Maior.maior(10, 7, 25));
        System.out.println("int (4): " + Maior.maior(10, 7, 25, 3));
        System.out.println("int (5): " + Maior.maior(10, 7, 25, 3, 18));

        System.out.println("double (2): " + Maior.maior(1.5, 2.7));
        System.out.println("double (3): " + Maior.maior(1.5, 2.7, 2.6));
        System.out.println("double (4): " + Maior.maior(1.5, 2.7, 2.6, -9.0));
        System.out.println("double (5): " + Maior.maior(1.5, 2.7, 2.6, -9.0, 100.01));
    }
}
