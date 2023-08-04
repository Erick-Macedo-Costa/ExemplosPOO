package atividade040823;

public class Principal {
    public static void main(String[] args) {
        //EXERCICIO 1
        Produto produto1 = new Produto();
        produto1.descricao = "Maça ";
        produto1.valor = 5;
        produto1.percentualDesconto = 0.1;
        System.out.println(produto1.dados  ());

        System.out.println("\n");

        Produto produto2 = new Produto();
        produto2.descricao = "Banana ";
        produto2.valor = 2;
        produto2.percentualDesconto = 0.1;
        System.out.println(produto2.dados());
        //FIM DO EXERCICIO 1

        System.out.println("\n");

        //EXERCICIO 2
        Conta conta1 = new Conta();
        conta1.cliente = "João";
        conta1.saldo = 1000;
        conta1.limite = 1000;
        System.out.println(conta1.dados());
    }
}
