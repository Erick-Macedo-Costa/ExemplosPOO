package atividade2;

public class PrincipalFormulas {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.raio = 5;
        System.out.println(c1.dadosCirculo());

        Retangulo r1 = new Retangulo();
        r1.base = 5;
        r1.altura = 10;
        System.out.println(r1.dadosRetangulo());
    }
}
