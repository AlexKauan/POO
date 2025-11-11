public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca(
                "Orientacao a Objetos",
                "Maria Silva",
                320,
                2023,
                "Corredor 2, Prateleira D"
        );

        System.out.println(livro.descricao());
        System.out.println(livro.localizacao());
        livro.empresta();
        System.out.println("Emprestado: " + livro.estaEmprestado());
        livro.devolve();
        System.out.println("Emprestado apos devolucao: " + livro.estaEmprestado());
        System.out.println(livro);
    }
}

