package atividade4;

public class Cidade {
    public Estado estado;
    public String nome;

    public String dados() {
        return "Cidade: " + nome +estado.dados() ;
    }
}
