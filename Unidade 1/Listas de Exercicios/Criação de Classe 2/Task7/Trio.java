public class Trio<T> {
    private T a;
    private T b;
    private T c;

    public Trio(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int quantosIguais() {
        boolean ab = a == null ? b == null : a.equals(b);
        boolean ac = a == null ? c == null : a.equals(c);
        boolean bc = b == null ? c == null : b.equals(c);

        if (ab && ac) {
            return 3;
        }
        if (ab || ac || bc) {
            return 2;
        }
        return 0;
    }

    public void imprimir() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
