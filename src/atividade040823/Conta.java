package atividade040823;

public class Conta {
    String cliente;
    double saldo;
    double limite;

    public String cliente(){
        return "Saldo: " + cliente;
    }

    public double sacar(){
        return saldo;
    }

    public double limite(){
        return  limite;
    }

    public String dados(){
        return "Cliente: " + cliente + "\n" + "Saldo: " + saldo + "\n" + "Limite: " + limite;
    }

}
