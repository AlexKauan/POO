public class RegistroAcademico {
    private static int numeroDeMatriculas = 0;

    private int matricula;
    private String nome;
    private String curso;

    public RegistroAcademico(String nome, String curso) {
        numeroDeMatriculas++;
        this.matricula = numeroDeMatriculas;
        this.nome = nome;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public static int getNumeroDeMatriculas() {
        return numeroDeMatriculas;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + " | Nome: " + nome + " | Curso: " + curso;
    }
}
