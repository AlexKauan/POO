public class Task8Main {
    public static void main(String[] args) {
        System.out.println("Resposta: C");
        System.out.println("Alternativa:\npackage P1;\nimport P2.*;\nabstract public class Figura {\ndouble x,y;\nfinal double PI=3.14159;\nDesenho d;\nabstract protected double dist(double x1,double y1);\n}\npackage P1;\npublic class Circulo extends Figura {\ndouble r;\npublic Circulo() { d.add(this); }\npublic double raio() { return r; }\npublic double centroX() { return x; }\npublic double centroY() { return y; }\npublic double dist(double x1,double y1) {\nreturn Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));\n}\n}\npackage P2;\nimport java.util.List;\nimport P1.Figura;\npublic class Desenho {\nList<Figura> f;\npublic void add(Figura p) { f.add(p); }\n}");
        System.out.println("Justificativa: Somente a alternativa C mantem modificadores e assinaturas corretas em arquivos separados.");
    }
}

