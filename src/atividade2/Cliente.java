package atividade2;

public class Cliente {

    String nome;
    String profissao;
    Double rendaMensal;
    Double valorEmprestimo;
     int parcelas;

    public Cliente(String nome, String profissao, Double rendaMensal, Double valorEmprestimo, int parcelas) {
        this.nome = nome;
        this.profissao = profissao;
        this.rendaMensal = rendaMensal;
        this.valorEmprestimo = valorEmprestimo;
        this.parcelas = parcelas;
    }

    public String dados() {
        return "Nome: " + nome + "\n" + "Profissão: " + profissao + "\n" + "Renda Mensal: " + rendaMensal + "\n" + "Valor do Empréstimo: " + valorEmprestimo;
    }

}
