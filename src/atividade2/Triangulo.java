package atividade2;

public class Triangulo {
    double base;
    double altura;

    public double area(){
        return (base * altura) / 2;
    }

    public double perimetro(){
        return base * 3;
    }

    public String dadosTriangulo(){
        return "Dados do Triangulo:" + "\nÁrea: " + area() + "\nPerímetro: " + perimetro();
    }
}
