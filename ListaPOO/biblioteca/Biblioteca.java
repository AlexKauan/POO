package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String titulo) {
        for (Livro item : livros) {
            if (item.getTitulo().equals(titulo)) {
                livros.remove(item);
                return;
            }

        }
    }

    public void exibirLivros() {
        for (Livro item : livros) {
            System.out.println(item);
        }
    }

    public String buscarLivro(String titulo) {
        for (Livro item : livros) {
            if (item.getTitulo().equals(titulo)) {
                return item.toString();
            }
        }
        return "Livro nao encontrado";
    }

}
