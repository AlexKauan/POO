package abstrato.task46;

import abstrato.task45.Circulo;
import abstrato.task45.Quadrado;
import abstrato.task45.Triangulo;

public class DemoDesenho {
    public static void main(String[] args) {
        Circulo bola = new Circulo();
        Quadrado cubo = new Quadrado();
        Triangulo piramides = new Triangulo();
        Desenho desenho1 = new Desenho(bola, cubo, 3, 6, 10, 3);
        Desenho desenho2 = new Desenho(cubo, piramides, 1, 5, 8, 3);

        desenho1.apresenta();
        desenho2.apresenta();
    }
}
