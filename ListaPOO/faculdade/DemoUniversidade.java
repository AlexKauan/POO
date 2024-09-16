package faculdade;

import java.util.ArrayList;

public class DemoUniversidade {
    public static void main(String[] args) {
        Professor professor = new Professor("Italo", 23, "BTI");
        Professor professor1 = new Professor("Josenildo", 23, "BTI");
        ArrayList<Estudante> estudante;
        estudante = new ArrayList<>();
        Disciplina disciplina = new Disciplina("POO", professor);
        Disciplina disciplina2 = new Disciplina("C1", professor1, estudante);

        disciplina.adicionarEstudante(new Estudante("alex", 25, "1245678"));
        disciplina.exibirInfo();
        disciplina2.adicionarEstudante(new Estudante("Pedro", 25, "2446578647"));
        disciplina2.exibirInfo();

    }
}
