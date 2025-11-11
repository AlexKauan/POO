public class DemonstracaoPolitica {
    public static void main(String[] args) {
        Politico vereador = new Politico("Joao Lima", 45, "Partido Verde");
        Prefeito prefeita = new Prefeito("Maria Costa", 50, "Partido Azul", "Natal");
        Governador governador = new Governador("Carlos Silva", 55, "Partido Laranja", "Rio Grande do Norte");

        System.out.println(vereador);
        System.out.println(prefeita);
        System.out.println(governador);
    }
}

