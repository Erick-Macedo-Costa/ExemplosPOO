package atividade040823;

public class Produto {
    String descricao;
    double valor;

    public String dados(double desconto) {
        return "Unidade da " + descricao + "e " + valor + " reais" + "\n" + desconto(desconto) + "\n" + total(desconto);
    }

    public String desconto(double desconto) {
        return "Desconto: " + desconto;
    }


    public String total(double desconto) {
        return "Total: " + valorDesconto(desconto) ;
    }

    public double valorDesconto(double desconto) {
        return valor - desconto;
    }

}
