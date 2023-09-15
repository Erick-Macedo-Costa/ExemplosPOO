package aula150923;
public class Principal{

    public static void main(String[] args) {
        
        Disciplina disc1 = new Disciplina();
        disc1.ch = 60;
        disc1.nome = "POO";
        
        Disciplina disc2 = new Disciplina();
        disc2.ch = 60;
        disc2.nome = "PWEB";

        //cria um aluno
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Marcus";
        aluno1.disciplinas.add(disc1);
        aluno1.disciplinas.add(disc2);

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Danyele";
        aluno2.disciplinas.add(disc2);

        System.out.println(aluno2.dados());

    }

}