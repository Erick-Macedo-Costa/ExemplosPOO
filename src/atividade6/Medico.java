package atividade6;

import java.util.List;

public class Medico extends Pessoa {
     List<Consulta> consultas;
     String crm;

    public String dados() {
        return super.dados() +
                "\nCRM: " + crm;
    }
}
