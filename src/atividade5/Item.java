package atividade5;

public class Item {
    Produto produto;
    double quantidade;

    double total() {
        return produto.preco * quantidade;
    }

    String dados() {
        return produto.dados() + "\nQuantidade: " + quantidade + ", Total: " + total();
    }
}
