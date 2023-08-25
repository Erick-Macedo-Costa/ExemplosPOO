package atividade4;

public class Endereco {
    public Cidade cidade;
    public String logradouro;
    public String barrio;
    public int cep;
    public String complemento;


    public String dados() {
        return "Logradouro: " + logradouro + "\nBairro: " + barrio + "\nCEP: " + cep + "\nComplemento: " + complemento + "\n" +cidade.dados();
    }
}
