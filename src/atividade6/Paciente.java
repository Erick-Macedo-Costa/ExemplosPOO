package atividade6;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    List<Consulta> consultas = new ArrayList<>();
    String telefone;


    public String dados() {
        return "Paciente\n" + super.dados() +
                "\nTelefone: " + telefone;
    }

    public String consulta() {
        for (Consulta consulta : consultas) {
            return consulta.dados();
        }
        return consulta();
    }

}
