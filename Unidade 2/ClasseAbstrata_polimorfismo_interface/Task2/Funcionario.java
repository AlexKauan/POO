public class Funcionario {
    private String nome;
    private double salarioPorHora;
    private double horasTrabalhadasNoMes;

    public Funcionario(String nome) {
        this(nome, 2.0);
    }

    public Funcionario(String nome, double salarioPorHora) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
    }

    public void registrarHoras(double horas) {
        if (horas > 0) {
            horasTrabalhadasNoMes += horas;
        }
    }

    public double calcularPagamento() {
        return horasTrabalhadasNoMes * salarioPorHora;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public double getHorasTrabalhadasNoMes() {
        return horasTrabalhadasNoMes;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioPorHora=" + salarioPorHora +
                ", horasTrabalhadasNoMes=" + horasTrabalhadasNoMes +
                '}';
    }
}
