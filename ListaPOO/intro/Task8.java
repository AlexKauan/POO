package intro;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        int setor, valorProduto, valorDesconto, valorFinal;

        System.out.println("Digite o O código do setor que você quer e o valor do produto: ");
        System.out.println("Setor Cama mesa e banho: Código 111");
        System.out.println("Setor Eletros: Código 222");
        System.out.printf("Digite o Código do setor: ");
        setor = log.nextInt();
        System.out.printf("Valor do Produto: ");
        valorProduto = log.nextInt();

        switch (setor) {
            case 111:
                System.out.println("Setor cama,mesa e banho");
                if (valorProduto > 100) {
                    valorDesconto = (40 * valorProduto) / 100;
                    valorFinal = valorProduto - valorDesconto;
                    System.out.println("Valor do Produto com Desconto: " + valorFinal);
                } else if (valorProduto > 50 && valorProduto < 100) {
                    valorDesconto = (20 * valorProduto) / 100;
                    valorFinal = valorProduto - valorDesconto;
                    System.out.println("Valor do Produto com Desconto: " + valorFinal);
                } else if (valorProduto < 50) {
                    valorDesconto = (10 * valorProduto) / 100;
                    valorFinal = valorProduto - valorDesconto;
                    System.out.println("Valor do Produto com Desconto: " + valorFinal);
                }
                break;
            case 222:
                System.out.println("Setor cama,mesa e banho");
                if (valorProduto > 500) {
                    valorDesconto = (10 * valorProduto) / 100;
                    valorFinal = valorProduto - valorDesconto;
                    System.out.println("Valor do Produto com Desconto: " + valorFinal);
                } else {
                    System.out.println("Desconto só será aplicado em produtos acima de 500R$");
                }
                break;
            default:
                System.out.println("Setor Inválido!");
        }

        log.close();

    }
}
