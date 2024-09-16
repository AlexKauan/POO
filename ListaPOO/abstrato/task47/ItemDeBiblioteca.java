package abstrato.task47;

public interface ItemDeBiblioteca {
    int maximoDeDias = 14;

    public boolean estaEmprestado();

    public void empresta();

    public void devolve();

    public String localizacao();

    public String descricao();
}
