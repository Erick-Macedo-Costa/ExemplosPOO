package atividade7;

public class Gerente extends Funcionario{
        private String gratificacao;
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    public String getGratificacao() {
        return gratificacao;
    }
    public void setGratificacao(String gratificacao) {
        this.gratificacao = gratificacao;
    }
    @Override
    public String dados() {
        return "Gerente:\n" + super.dados() + "Gratificação: " + gratificacao+ "\n";
    }
}
