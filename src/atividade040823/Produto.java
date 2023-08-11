package atividade040823;

public class Produto {
    String descricao;
    double valor;
    double percentualDesconto;

    public String dados() {
        return "Unidade da " + descricao + "e " + valor + " reais" + "\n" + "Desconto: "+ desconto() + "\n"+ "Total: " + total();
    }

    public double desconto() {
        return  percentualDesconto / 100 * valor  ;
    }

    public double total() {
        return valor - desconto();
    }

}
