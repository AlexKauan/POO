import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        try (Scanner log = new Scanner(System.in)) {
            int dia, indice;
            String diaDaSemana;

            System.out.println("Digite um numero de (1 a 28):");
            dia = log.nextInt();

            if(dia < 1 || dia > 28){
                System.out.println("Numero de dia inválido! insira um valor entre 1 e 28.");
            }else {
                indice = (dia - 1) % 7;

                switch (indice){
                    case 1 -> {
                        diaDaSemana = "Segunda-Feira";
                        System.out.println( dia+ "É uma " + diaDaSemana);
                    }

                    case 2 -> {
                        diaDaSemana = "Terça-Feira";
                        System.out.println( dia+ "É uma " + diaDaSemana);
                    }

                    case 3 -> {
                        diaDaSemana = "Quarta-Feira";
                        System.out.println( dia+ "É uma " + diaDaSemana);
                    }

                    case 4 -> {
                        diaDaSemana = "Quinta-Feira";
                        System.out.println( dia+ "É uma " + diaDaSemana);
                    }

                    case 5 -> {
                        diaDaSemana = "Sexta-Feira";
                        System.out.println( dia+ "É uma " + diaDaSemana);
                    }

                    case 6 -> {
                        diaDaSemana = "Sábado";
                        System.out.println( dia+ "É uma " + diaDaSemana);
                    }

                    case 7 -> {
                        diaDaSemana = "Domingo";
                        System.out.println( dia+ "É uma " + diaDaSemana);
                    }
                }

            }
        }

    }
}