package abstrato.task47;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca {

    private boolean estaEmprestado;
    private String localizacao;
    private String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numPaginas, int anoEdicao, boolean estaEmprestado,
            String localizacao, String descricao) {
        super(titulo, autor, numPaginas, anoEdicao);
        this.estaEmprestado = estaEmprestado;
        this.localizacao = localizacao;
        this.descricao = descricao;
    }

    public boolean estaEmprestado() {
        return estaEmprestado;
    }

    public void empresta() {
        if (!estaEmprestado) {
            estaEmprestado = true;
            System.out.println(maximoDeDias);
        }
    }

    public void devolve() {
        if (estaEmprestado) {
            estaEmprestado = false;
        }
    }

    public String localizacao() {
        return localizacao;
    }

    public String descricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return super.toString() + ",  estaEmprestado=" + estaEmprestado + ", localizacao=" + localizacao
                + ", descricao="
                + descricao;
    }

}
