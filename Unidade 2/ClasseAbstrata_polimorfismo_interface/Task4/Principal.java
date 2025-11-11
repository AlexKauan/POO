public class Principal {
    public static void main(String[] args) {
        Desenho primeiro = new Desenho(new Circulo(), 1, 2, new Quadrado(), 3, 4);
        Desenho segundo = new Desenho(new Quadrado(), -1, 0, new Triangulo(), 5, -2);

        primeiro.apresenta();
        segundo.apresenta();
    }
}

