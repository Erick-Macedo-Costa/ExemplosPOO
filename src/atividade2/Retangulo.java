package atividade2;

public class Retangulo {
    double base;
    double altura;

    public double area(){
        return base * altura;
    }

    public double perimetro(){
        return 2 * (base + altura);
    }

    public String dadosRetangulo(){
        return "Dados do Retangulo:" + "\nÁrea: " + area() + "\nPerímetro: " + perimetro();
    }

}
