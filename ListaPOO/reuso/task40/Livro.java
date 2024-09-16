package reuso.task40;

public class Livro {
    private String autor;
    private String titulo;
    private int ano;

    public Livro(String autor, String titulo, int ano) {
        this.ano = ano;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", titulo=" + titulo + ", ano=" + ano + "]";
    }

}
