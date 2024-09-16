package biblioteca;

import java.util.Scanner;

public class DemoBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner log = new Scanner(System.in);

        String autor;

        autor = log.nextLine();

        biblioteca.adicionarLivro(new Livro("dbz", autor, 1234));

        biblioteca.exibirLivros();

    }
}
