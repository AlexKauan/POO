package Aulas.Triangulo;

public class Triangulo {
    double l1;
    double l2;
    double l3;
    String desc;

    void inicializarTriangulo(double lado1, double lado2, double lado3, String info){
        l1 = lado1;
        l2 = lado2;
        l3 = lado3;
        desc = info;
    }

    double perimetro(){
        return (l1+l2+l3);
    }
}
