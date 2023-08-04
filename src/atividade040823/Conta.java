package atividade040823;

public class Conta {
    String cliente;
    double saldo;
    double limite;

    public String cliente(double saldo){
        return "Cliente: " + cliente;
    }

    public String sacar(double saldo){
        return ( saldo >= 1 ) ? " pode sacar" : " não pode sacar";
    }

    public double limite(double saldo){
        return  limite;
    }

    public String dados(){
        return cliente(saldo) + "\n" + "Saldo: " + saldo + "\n" + "Limite: " + limite(saldo);
    }

    public String dados2(double saldo){
        return cliente(saldo) + sacar(saldo);
    }

}
