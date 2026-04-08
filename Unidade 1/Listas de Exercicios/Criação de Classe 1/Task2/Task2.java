import java.util.Locale;

public class Task2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Fatura faturaValida = new Fatura("A100", "Mouse USB", 3, 49.90);
        Fatura faturaInvalida = new Fatura("B200", "Teclado Mecanico", -5, -199.90);

        System.out.println("=== Fatura 1 ===");
        System.out.println("Numero: " + faturaValida.getNumeroIdentificacao());
        System.out.println("Descricao: " + faturaValida.getDescricao());
        System.out.println("Quantidade: " + faturaValida.getQuantidadeComprada());
        System.out.printf("Preco unitario: %.2f%n", faturaValida.getPrecoUnitario());
        System.out.printf("Total: %.2f%n", faturaValida.calculaTotal());

        System.out.println();
        System.out.println("=== Fatura 2 (valores invalidos ajustados) ===");
        System.out.println("Numero: " + faturaInvalida.getNumeroIdentificacao());
        System.out.println("Descricao: " + faturaInvalida.getDescricao());
        System.out.println("Quantidade: " + faturaInvalida.getQuantidadeComprada());
        System.out.printf("Preco unitario: %.2f%n", faturaInvalida.getPrecoUnitario());
        System.out.printf("Total: %.2f%n", faturaInvalida.calculaTotal());
    }
}
