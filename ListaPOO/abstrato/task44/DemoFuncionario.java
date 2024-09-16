package abstrato.task44;

public class DemoFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("alex");
        Funcionario funcionario2 = new Funcionario("pedro", 60);

        System.out.println(funcionario.salario(6));
        System.out.println(funcionario2.salario(4));
    }
}
