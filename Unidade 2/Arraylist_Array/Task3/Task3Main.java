import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();

        while (true) {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            if (id < 0) {
                break;
            }

            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Telefone: ");
            String telefone = scanner.nextLine();

            clientes.add(new Cliente(id, nome, idade, telefone));
        }

        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

