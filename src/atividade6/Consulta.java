package atividade6;

import java.time.LocalDateTime;

public class Consulta {
     LocalDateTime data;
     double valor;
     String observacao;
     Medico medico;
     Paciente paciente;


    public double total() {
      return valor;
   }
    public String dados() {
        return "Data: " + data +
                "\nValor: " + total() +
                "\nObservação: " + observacao +
                "\n" + medico.dados() +
                "\n" + paciente.dados();
    }
}
