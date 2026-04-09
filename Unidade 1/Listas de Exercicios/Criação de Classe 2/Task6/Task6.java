public class Task6 {
    public static void main(String[] args) {
        RegistroAcademico a1 = new RegistroAcademico("Ana", "Computacao");
        RegistroAcademico a2 = new RegistroAcademico("Bruno", "Engenharia");
        RegistroAcademico a3 = new RegistroAcademico("Carla", "Matematica");

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("Total de matriculas geradas: " + RegistroAcademico.getNumeroDeMatriculas());
    }
}
