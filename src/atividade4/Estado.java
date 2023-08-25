package atividade4;

public class Estado {
    public String nome;
    public String sigla;

    public String dados() {
        return ", " + nome +  "\nUF: " + sigla;
    }
}