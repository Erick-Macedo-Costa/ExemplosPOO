package atividade7;

public class Estagiario extends Funcionario{
    private String curso;
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public String dados() {
        return super.dados() + "Curso: " + curso+ "\n";
    }

}
