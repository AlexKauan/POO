public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", 5.0);
        funcionario.registrarHoras(160);

        System.out.println(funcionario);
        System.out.println("Pagamento devido: " + funcionario.calcularPagamento());
    }
}

