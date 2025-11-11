public class TesteEventos {
    public static void main(String[] args) {
        DataHora dataReuniao = new DataHora(15, 3, 2025, 9, 30);
        EventoDelegacao reuniaoEquipe = new EventoDelegacao(dataReuniao, "Reuniao da equipe");

        EventoHeranca palestra = new EventoHeranca(20, 4, 2025, 19, 0, "Palestra sobre reuso de classes");

        System.out.println(reuniaoEquipe);
        System.out.println(palestra);
    }
}

