package atividade5;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.descricao = "Maça";
        produto1.preco = 5;

        Produto produto2 = new Produto();
        produto2.descricao = "Banana";
        produto2.preco = 10;

        Produto produto3 = new Produto();
        produto3.descricao = "Pera";
        produto3.preco = 15;

        Item item1 = new Item();
        item1.produto = produto1;
        item1.quantidade = 1;

        Item item2 = new Item();
        item2.produto = produto2;
        item2.quantidade = 2;

        Item item3 = new Item();
        item3.produto = produto3;
        item3.quantidade = 2;

        Venda venda = new Venda();
        venda.data = LocalDate.now();
        venda.itens.add(item1);
        venda.itens.add(item2);
        venda.itens.add(item3);

        System.out.println(venda.dados());

    }
}
