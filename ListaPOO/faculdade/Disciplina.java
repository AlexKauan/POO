package faculdade;

import java.util.ArrayList;

public class Disciplina {
    private String nomeDisciplina;
    private Professor professor;
    private ArrayList<Estudante> estudante;

    public Disciplina(String nomeDisciplina, Professor professor) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.estudante = new ArrayList<>();
    }

    public Disciplina(String nomeDisciplina, Professor professor, ArrayList<Estudante> estudante) {
        this.nomeDisciplina = nomeDisciplina;
        this.professor = professor;
        this.estudante = estudante;
    }

    public void adicionarEstudante(Estudante estudante) {
        this.estudante.add(estudante);
    }

    public void removerEstudante(String nome) {
        for (Estudante item : estudante) {
            if (item.getNome().equals(nome)) {
                estudante.remove(item);
                return;
            }
        }
    }

    public void exibirInfo() {
        System.out.println(nomeDisciplina);
        System.out.println(professor.getNome());
        for (Estudante item : estudante) {
            System.out.println(item);
        }
    }
}
