package atividade5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    List<Item> itens = new ArrayList<>();
    LocalDate data;

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
