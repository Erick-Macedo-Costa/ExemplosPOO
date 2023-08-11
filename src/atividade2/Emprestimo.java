package atividade2;

public class Emprestimo {
    Cliente cliente;
    double taxaJuros;

    public Emprestimo(Cliente cliente, double taxaJuros) {
        this.cliente = cliente;
        this.taxaJuros = taxaJuros;
    }

    public String aprovacao() {
        return (cliente.valorEmprestimo > cliente.rendaMensal * 0.3) ? "Emprestimo negado" : "Emprestimo aceito";
    }

    double valorTotal() {
        double valorTotal = cliente.valorEmprestimo / Cliente.parcelas;
        double valorSomado = 0;
        for (int i = 0; i < Cliente.parcelas; i++) {
            valorTotal += valorTotal * (taxaJuros / 100);
            valorSomado += valorTotal;
        }
        valorSomado += cliente.valorEmprestimo;
        return valorSomado;
    }

    double valorParcelas() {
        double valorParcelas = valorTotal() / Cliente.parcelas;
        return valorParcelas;

    }

    String totalParcelas() {
        String parcelas = "";
        for (int i = 0; i < Cliente.parcelas; i++) {
            parcelas += (i + 1) + " Parcela: R$" + valorParcelas() + "\n";
        }
        return parcelas ;
    }

    public String dados(){
        String aprovacao = aprovacao();

        if (aprovacao.equals("Emprestimo negado")) {
            return aprovacao;
        } else {
            return  "\n" + aprovacao + "\n" + "Total de parcelas: " + Cliente.parcelas + "\n" + totalParcelas();
        }
    }
}