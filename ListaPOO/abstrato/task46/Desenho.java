package abstrato.task46;

import abstrato.task45.FiguraGeometrica;

public class Desenho {
    private FiguraGeometrica figura1;
    private FiguraGeometrica figura2;
    private double x;
    private double y;
    private double x2;
    private double y2;

    public Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, double x, double y, double x2, double y2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void apresenta() {
        figura1.descricao();

        System.out.println(x + " " + y);

        figura2.descricao();

        System.out.println(x2 + " " + y2);
    }

}
