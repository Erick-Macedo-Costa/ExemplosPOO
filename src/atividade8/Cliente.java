package atividade8;

public class Cliente extends Pessoa{

    String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        super(nome, cpf);
        this.telefone = telefone;

    }

    public String dados(){
        return super.dados() + "\nTelefone: " + telefone;
    }


}
