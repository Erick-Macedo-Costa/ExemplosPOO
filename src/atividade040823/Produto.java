package atividade040823;

public class Produto {
    String descricao;
    double valor;

    public String dados() {
        return "Unidade da " + descricao + "e " + valor + " reais" + "\n" + desconto() + "\n" + total();
    }

    public String desconto() {
        return "Desconto: " + valor * 0.1;
    }

    public String total() {
        return "Total: " + valorDesconto() ;
    }

    public double valorDesconto() {
        double desconto = valor * 0.1;
        return valor - desconto;
    }

}
