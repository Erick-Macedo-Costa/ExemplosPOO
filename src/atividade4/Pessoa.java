package atividade4;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pessoa {
    private Endereco endereco;
    private String nome;
    private DateFormat dataNascimento;


    public double idade() {
        return 2023 - dataNascimento.getCalendar().get(Calendar.YEAR);
    }

    public String dados() {
        return "Nome: " + nome + "Idade: " + idade();
    }
}
