package atividade8;

public class Locacao {
    private Veiculo veiculo;
    private Cliente cliente;
    private Funcionario funcionario;
    private int dias;

    public Locacao(Veiculo veiculo, Cliente cliente, Funcionario funcionario, int dias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dias = dias;
    }

    public double valorTotal(){
        return this.veiculo.getValor() * this.dias;
    }

    public String dados(){
        return "Dados do veículo: \n" + this.veiculo.dados() + "\n\nDados do cliente: \n" + this.cliente.dados() + "\n\nDados do funcionário: \n" + this.funcionario.dados() + "\n\nDias: " + this.dias + "\nValor total: " + valorTotal();
    }

}
