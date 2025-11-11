public class TestaEquipamento {
    public static void main(String[] args) {
        Equipamento impressora = new Equipamento("Laser X200", "PrintTech");
        Computador desktop = new Computador("NovaStation", "CompSystems", "Intel i5", 16);

        System.out.println(impressora);
        System.out.println(desktop);
    }
}

