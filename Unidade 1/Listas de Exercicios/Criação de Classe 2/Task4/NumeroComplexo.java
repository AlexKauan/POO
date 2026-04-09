public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public NumeroComplexo(double parteReal) {
        this(parteReal, 0.0);
    }

    public NumeroComplexo() {
        this(0.0, 0.0);
    }

    @Override
    public String toString() {
        if (parteImaginaria == 0.0) {
            return String.valueOf(parteReal);
        }

        if (parteReal == 0.0) {
            return parteImaginaria + "i";
        }

        return parteReal + (parteImaginaria < 0 ? " - " : " + ") + Math.abs(parteImaginaria) + "i";
    }
}
