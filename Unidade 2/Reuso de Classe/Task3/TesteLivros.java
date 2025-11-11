public class TesteLivros {
    public static void main(String[] args) {
        LivroLivraria romance = new LivroLivraria("Mar aberto", "Lia Souza", "978-0-111", 59.9, 12);
        LivroBiblioteca tecnico = new LivroBiblioteca("Fundamentos de POO", "Ana Lima", "978-0-222", "TEC-452");

        tecnico.emprestar();

        System.out.println(romance);
        System.out.println(tecnico);
    }
}

