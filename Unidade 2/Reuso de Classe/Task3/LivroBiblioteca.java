public class LivroBiblioteca extends Livro {
    private final String codigoCatalogo;
    private boolean emprestado;

    public LivroBiblioteca(String titulo, String autor, String isbn, String codigoCatalogo) {
        super(titulo, autor, isbn);
        this.codigoCatalogo = codigoCatalogo;
    }

    public String getCodigoCatalogo() {
        return codigoCatalogo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    @Override
    public String toString() {
        return "LivroBiblioteca{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", isbn='" + getIsbn() + '\'' +
                ", codigoCatalogo='" + codigoCatalogo + '\'' +
                ", emprestado=" + emprestado +
                '}';
    }
}

