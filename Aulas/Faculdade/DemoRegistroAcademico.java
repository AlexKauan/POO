package Aulas.Faculdade;

import java.beans.XMLEncoder;

public class DemoRegistroAcademico {
    public static void main(String[] args){
        RegistroAcademico michel = new RegistroAcademico();
        michel.inicializaRegistroAcademico("alex", "sdasd", 2, 0.7);
        double mesalidade = michel.calculaMensalidade();

        System.out.println("A mensalidade eh: " + mesalidade);

    }
}
