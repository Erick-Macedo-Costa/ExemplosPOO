package atividade5;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    List<Item> itens = new ArrayList<>();
    LocalDateTime data;

    private double total() {
        double total = 0;
        for (Item item : itens) {
            total += item.total();
        }
        return total;
    }

    public String dados() {
        String dados = "Data: " + data + "\n";
        for (Item item : itens) {
            dados += item.dados() + "\n";
        }
        dados += "\nVenda Total: " + total();
        return dados;
    }
}
