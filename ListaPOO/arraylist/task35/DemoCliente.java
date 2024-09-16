package arraylist.task35;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoCliente {
    public static void main(String[] args) {
        Scanner log = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("Digite o ID do cliente (ou um número negativo para sair): ");
            int id = log.nextInt();
            log.nextLine();

            if (id < 0) {
                break;
            }

            System.out.print("Digite o nome do cliente: ");
            String nome = log.nextLine();

            System.out.print("Digite a idade do cliente: ");
            int idade = log.nextInt();
            log.nextLine();

            System.out.print("Digite o telefone do cliente: ");
            String telefone = log.nextLine();

            Cliente cliente = new Cliente(id, nome, idade, telefone);
            clientes.add(cliente);
        }

        System.out.println("\nLista de Clientes:");
        for (Cliente cliente : clientes) {
            cliente.exibirCliente();
        }

        log.close();

    }
}
