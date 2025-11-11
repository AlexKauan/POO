public class Desenho {
    private final FiguraGeometrica primeiraFigura;
    private final double primeiraX;
    private final double primeiraY;
    private final FiguraGeometrica segundaFigura;
    private final double segundaX;
    private final double segundaY;

    public Desenho(FiguraGeometrica primeiraFigura, double primeiraX, double primeiraY,
                   FiguraGeometrica segundaFigura, double segundaX, double segundaY) {
        this.primeiraFigura = primeiraFigura;
        this.primeiraX = primeiraX;
        this.primeiraY = primeiraY;
        this.segundaFigura = segundaFigura;
        this.segundaX = segundaX;
        this.segundaY = segundaY;
    }

    public void apresenta() {
        System.out.println("Figura 1 em (" + primeiraX + ", " + primeiraY + "):");
        primeiraFigura.descricao();
        System.out.println("Figura 2 em (" + segundaX + ", " + segundaY + "):");
        segundaFigura.descricao();
    }
}

