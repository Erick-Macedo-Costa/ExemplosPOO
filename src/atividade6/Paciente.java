package atividade6;

import java.util.List;

public class Paciente extends Pessoa {
    List<Consulta> consultas ;
    String telefone;


    public String dados() {
        return super.dados() +
                "\nTelefone: " + telefone ;
    }


}
