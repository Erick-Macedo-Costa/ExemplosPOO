package atividade110823;

public class Cliente {

    String nome;
    String profissao;
    Double rendaMensal;
    Double valorEmprestimo;
    static int parcelas;

    public Cliente(String nome, String profissao, Double rendaMensal, Double valorEmprestimo, int parcelas) {
        this.nome = nome;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.valorEmprestimo = valorEmprestimo;
        Cliente.parcelas = parcelas;
    }

    public String dados() {
        return "Nome: " + nome + "\n" + "Profissão: " + profissao + "\n" + "Renda Mensal: " + rendaMensal + "\n" + "Valor do Empréstimo: " + valorEmprestimo;
    }

}
