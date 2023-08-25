package atividade4;

import java.time.LocalDate;

public class Pessoa {
    public Endereco endereco;
    public String nome;
    public LocalDate dataNascimento;

    public String idade(){
        int idade = 2023 - dataNascimento.getYear();
        return ", " + idade + " anos";
    }

    public String dados() {
        return "Nome: " + nome  + idade() + "\n" + endereco.dados();
    }
}
