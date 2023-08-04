package atividade040823;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.descricao = "Maça ";
        produto1.valor = 5;
        double desconto1 = 0.5;
        System.out.println(produto1.dados(produto1.valorDesconto(desconto1)));

        System.out.println("\n");

        Produto produto2 = new Produto();
        produto2.descricao = "Banana ";
        produto2.valor = 2;
        double desconto2 = 0.5;
        System.out.println(produto2.dados(desconto2));
    }
}
