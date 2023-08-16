package atividade2;

import java.text.DecimalFormat;

public class Emprestimo {
    Cliente cliente;
    double taxaJuros;

    public Emprestimo(Cliente cliente, double taxaJuros) {
        this.cliente = cliente;
        this.taxaJuros = taxaJuros;
    }

    public String aprovacao() {
        return cliente.valorEmprestimo >= (cliente.rendaMensal * 0.3) ? "Emprestimo negado" : "Emprestimo aceito";
    }

    public double valorParcelaMensal(){
        return cliente.valorEmprestimo /  cliente.parcelas;
    }

    public double calculoJuros() {
        return taxaJuros / 100;
    }


    public double valorParcelas() {
        double valorParcela = valorParcelaMensal();
        for (int i = 0; i < cliente.parcelas; i++) {
            valorParcela += valorParcela * calculoJuros();
        }
        return valorParcela;
    }

    public String totalParcelas() {
        String parcelas = "";
        for (int i = 0; i < cliente.parcelas; i++) {
            parcelas += (i + 1) + " Parcela: R$" + DecimalFormat.getCurrencyInstance().format(valorParcelas()) + "\n";
        }
        return parcelas ;
    }

    public String ValorTotalEmprestimo() {
        return "Valor do empréstimo: " + DecimalFormat.getCurrencyInstance().format(valorParcelas() * cliente.parcelas);
    }

    public String dados(){
        String aprovacao = aprovacao();

        if (aprovacao.equals("Emprestimo negado")) {
            return aprovacao;
        } else {
            return  "\n" + aprovacao + "\n" + "Total de parcelas: " + cliente.parcelas + "\n" + ValorTotalEmprestimo() +"\n" + totalParcelas();
        }
    }
}