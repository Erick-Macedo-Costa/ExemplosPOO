package aula040823;

import java.time.LocalDate;

public class PessoaFisica {
    public String nome;
    public LocalDate dataNascimento;
    public String cpf;

    public int idade(){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }
    public String dados() {
        return nome + ", CPF: " + cpf+", Data de Nascimento: "+dataNascimento+", Idade: "+idade();
    }

}
