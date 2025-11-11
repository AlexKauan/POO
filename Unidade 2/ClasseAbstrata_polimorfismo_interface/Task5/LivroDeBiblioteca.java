public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {
    private final String localizacao;
    private boolean emprestado;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDaEdicao, String localizacao) {
        super(titulo, autor, numeroDePaginas, anoDaEdicao);
        this.localizacao = localizacao;
    }

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }

    @Override
    public void empresta() {
        emprestado = true;
    }

    @Override
    public void devolve() {
        emprestado = false;
    }

    @Override
    public String localizacao() {
        return localizacao;
    }

    @Override
    public String descricao() {
        return "Livro para emprestimo: " + qualTitulo();
    }

    @Override
    public String toString() {
        return super.toString() + ", localizacao='" + localizacao + '\'' +
                ", emprestado=" + emprestado + ", prazo=" + maximoDeDiasParaEmprestimo + " dias";
    }
}

