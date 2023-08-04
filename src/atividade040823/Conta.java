package atividade040823;

public class Conta {
    String cliente;
    double saldo;
    double limite;

    public String cliente(){
        return "Saldo: " + cliente;
    }

    public double sacar(){
        return "Saldo: " + saldo;
    }

    public double limite(){
        return  limite;
    }

}
