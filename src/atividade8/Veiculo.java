package atividade8;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private int dia;
    private double valor;

    public Veiculo(String marca, String modelo, int ano, double valor, int dia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.dia = dia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String dados(){
        return "Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nValor: " + valorTotal();

    }

    public double valorTotal(){
        return this.valor * getDia() ;
    }
}
