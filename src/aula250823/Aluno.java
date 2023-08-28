package aula250823;

public class Aluno {

    String matricula;

    String nome;

    Curso curso;

    String dados(){
        return "Matrícula: "+matricula+
                "\nNome: "+nome+
                "\n"+curso.dados();

    }


}
