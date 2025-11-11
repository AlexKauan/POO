public class LivroLivraria extends Livro {
    private final double preco;
    private final int estoque;

    public LivroLivraria(String titulo, String autor, String isbn, double preco, int estoque) {
        super(titulo, autor, isbn);
        this.preco = preco;
        this.estoque = estoque;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return "LivroLivraria{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}

