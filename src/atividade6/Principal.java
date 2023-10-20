package atividade6;

import java.time.LocalDateTime;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        paciente1.nome = "Erick";
        paciente2.nome = "Fagno";
        paciente1.telefone = "123456789";
        paciente2.telefone = "987654321";

        Medico medico1 = new Medico();
        Medico medico2 = new Medico();
        medico1.nome = "João";
        medico2.nome = "Maria";
        medico1.crm = "123456";
        medico2.crm = "654321";

        Consulta consulta1 = new Consulta();
        Consulta consulta2 = new Consulta();
        consulta1.valor = 100;
        consulta2.valor = 200;
        consulta1.observacao = "Exame de sangue";
        consulta2.observacao = "Exame de vista";

        consulta1.medico = medico1;
        consulta2.medico = medico2;
        consulta1.paciente = paciente1;
        consulta2.paciente = paciente2;

        paciente1.consultas.add(consulta1);
        paciente2.consultas.add(consulta2);
        medico1.consultas.add(consulta1);
        medico2.consultas.add(consulta2);

//        System.out.println(consulta1.dados());
//        System.out.println("====================================");
//        System.out.println(consulta2.dados());
//        System.out.println("====================================");
        System.out.println(paciente1.consulta());
        System.out.println("====================================");
        System.out.println(paciente2.consulta());
        System.out.println("====================================");
        System.out.println(medico1.consulta());
        System.out.println("====================================");
        System.out.println(medico2.consulta());
    }
}
