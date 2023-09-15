package aula150923;
import java.util.ArrayList;
import java.util.List;

public class Aluno{

    String nome;
    List<Disciplina> disciplinas=new ArrayList<>();

    String dados(){
        String dados="\nNome:"+nome+" (qtd:"+disciplinas.size()+")";
        for(Disciplina d : disciplinas)
            dados += "\nDisciplina: "+d.nome +"\nCH:"+d.ch+"\n";
        return dados;
    }
   
}

