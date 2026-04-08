public class Task2 {
    public static void main(String[] args) {
        Fatura f1 = new Fatura("A123", "Teclado mecânico", 2, 199.90);
        System.out.println("ID: " + f1.getId());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Quantidade: " + f1.getQuantidade());
        System.out.println("Preço unitário: " + f1.getPrecoUnitario());
        System.out.println("Total: " + f1.calculaTotal());

        Fatura f2 = new Fatura("B456", "Mouse sem fio", -3, -50.0);
        System.out.println("ID: " + f2.getId());
        System.out.println("Descrição: " + f2.getDescricao());
        System.out.println("Quantidade: " + f2.getQuantidade());
        System.out.println("Preço unitário: " + f2.getPrecoUnitario());
        System.out.println("Total: " + f2.calculaTotal());
    }
}
