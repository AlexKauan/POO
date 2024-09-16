package abstrato.task47;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro1 = new LivroDeBiblioteca("berserkk", "Heitor", 345, 1995, false, "Corredor 2", "mangá");
        LivroDeBiblioteca livro2 = new LivroDeBiblioteca("One piece", "Pedro", 1050, 1997, false, "Corredor 3",
                "mangá");

        System.out.println(livro1.descricao());
        livro1.empresta();
        System.out.println(livro1.localizacao());
        System.out.println(livro1.qualAutor());
        System.out.println(livro1.qualTitulo());

        System.out.println(livro1.estaEmprestado() ? "Está emprestado" : "Não está emprestado");
        livro1.devolve();
        System.out.println(livro1.estaEmprestado() ? "Está emprestado" : "Não está emprestado");
        livro2.empresta();
        System.out.println(livro2.estaEmprestado() ? "Está emprestado" : "Não está emprestado");

        System.out.println(livro1);
        System.out.println(livro2);
    }
}
