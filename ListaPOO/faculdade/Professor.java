package faculdade;

public class Professor extends Pessoa {
    private String departamento;

    public Professor(String nome, int idade, String departamento) {
        super(nome, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor [departamento=" + departamento + "]";
    }

}
