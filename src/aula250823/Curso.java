package aula250823;

public class Curso {

    String nome;

    int cargaHoraria;

    Coordenador coordenador;

    String dados(){
        return "Curso: "+nome+", CH:"+cargaHoraria+"h"+
                "\nCoordenador:"+coordenador.nome;
    }

}
