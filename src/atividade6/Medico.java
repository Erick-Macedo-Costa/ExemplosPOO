package atividade6;

import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
     List<Consulta> consultas = new ArrayList<>();
     String crm;

    public String dados() {
        return "Medico\n" + super.dados() +
                "\nCRM: " + crm ;
    }
    public String consulta() {
       for (Consulta consulta : consultas) {
           return consulta.dados();
       }
    return consulta();
    }
}
