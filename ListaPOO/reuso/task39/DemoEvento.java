package reuso.task39;

public class DemoEvento {
    public static void main(String[] args) {
        EventoDelegacao event1 = new EventoDelegacao("festa", 2, 1734, 3, "18:30");
        EventoHeranca event2 = new EventoHeranca(28, 1999, 1, "A mesma de ontem", "Aniversario");

        System.out.println(event2);
         System.out.println(event1);
    }
}
