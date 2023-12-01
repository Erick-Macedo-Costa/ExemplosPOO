package atividade8;

public class Funcionario extends Pessoa {
   private String matricula;

    public Funcionario(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public String dados(){
    return super.dados() + "\nMatrícula: " + matricula;
    }
}
