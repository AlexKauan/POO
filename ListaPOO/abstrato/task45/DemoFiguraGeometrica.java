package abstrato.task45;

public class DemoFiguraGeometrica {
    public static void main(String[] args) {
        FiguraGeometrica bola = new Circulo();
        Triangulo piramide = new Triangulo();
        Quadrado dado = new Quadrado();

        bola.descricao();
        piramide.descricao();
        dado.descricao();
        bola.calcularRaio();
    }
}
