package atividade040823;

public class Produto {
    String descricao;
    double valor;
    double percentualDesconto;

    public String dados() {
        return "Unidade da " + descricao + "e " + valor + " reais" + "\n" + desconto() + "\n" + total();
    }

    public String desconto() {
        return "Desconto: " + percentualDesconto   ;
    }


    public String total() {
        return "Total: " + (valor - percentualDesconto);
    }

}
