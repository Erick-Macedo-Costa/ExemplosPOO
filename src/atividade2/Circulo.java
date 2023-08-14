package atividade2;

public class Circulo {
    double raio;

    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public String dadosCirculo() {
    return "Dados do Circulo:" + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
    }

}
