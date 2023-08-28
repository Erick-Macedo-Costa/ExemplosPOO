package aula250823;

public class Principal {

    public static void main(String[] args) {

        Coordenador coordenador1 = new Coordenador();
        coordenador1.nome = "Prof. Marlio";

        Curso curso1 = new Curso();
        curso1.nome = "Sistemas para Internet";
        curso1.cargaHoraria = 2010;
        curso1.coordenador = coordenador1;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Erick";
        aluno1.matricula = "20110001001";
        aluno1.curso = curso1;
        System.out.println(aluno1.dados());


    }

}
