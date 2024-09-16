package reuso.task40;

public class LivroLivraria {
    private Livro livros;
    private double valor;

    public LivroLivraria(Livro livros, double valor) {
        this.livros = livros;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
