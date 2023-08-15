package atividade2;

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
        return cliente.valorEmprestimo / Cliente.parcelas;
    }


    public double valorParcelas() {
        double valorParcela = valorParcelaMensal();
        double calculoJuros = taxaJuros / 100;
        for (int i = 0; i < Cliente.parcelas; i++) {
            valorParcela += valorParcela * calculoJuros;
        }
        return valorParcela;
    }

    public String totalParcelas() {
        String parcelas = "";
        for (int i = 0; i < Cliente.parcelas; i++) {
            parcelas += (i + 1) + " Parcela: R$" + valorParcelas() + "\n";
        }
        return parcelas ;
    }

    public String ValorTotalEmprestimo() {
        return "Valor do empréstimo: " + valorParcelas() * Cliente.parcelas;
    }

    public String dados(){
        String aprovacao = aprovacao();

        if (aprovacao.equals("Emprestimo negado")) {
            return aprovacao;
        } else {
            return  "\n" + aprovacao + "\n" + "Total de parcelas: " + Cliente.parcelas + "\n" + ValorTotalEmprestimo() +"\n" + totalParcelas();
        }
    }
}