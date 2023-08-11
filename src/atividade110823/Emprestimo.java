package atividade110823;

public class Emprestimo {
    Cliente cliente;
    double taxaJuros;

    public Emprestimo(Cliente cliente, double taxaJuros) {
        this.cliente = cliente;
        this.taxaJuros = taxaJuros;
    }

    public String dados() {
        return cliente.dados()  + "\n" + "Valor Total: " + jurosAno();
    }

    public Double jurosMes(){
        return valorEmprestimo + (valorEmprestimo * 0.1);

    }

    public Double jurosAno(){
        return (valorEmprestimo + jurosMes()) * 0.1 * Cliente.parcelas;
    }

}
