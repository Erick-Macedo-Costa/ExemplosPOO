package atividade040823;

public class Conta {
    String cliente;
    double saldo;
    double limite;

    public Conta(String cliente, double saldo, double limite) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double valor) {
        if (valor > saldo + limite) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valor;
            System.out.println("Saque realizado. Saldo atual: " + saldo);
        }
        //return; (valor > saldo + limite) ? "Saldo insuficiente!" : "Saque realizado. Saldo atual: ";
    }

    public String depositar(double valor) {
        saldo += valor;
        return  "Depósito realizado. Saldo atual: " + saldo ;
    }

    public String retornarDados() {
        return "Cliente: " + cliente + ", Saldo: " + saldo + ", Limite: " + limite;
    }
}