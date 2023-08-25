package atividade4;

public class Endereco {
    private Cidade cidade;
    private String logradouro;
    private String barrio;
    private int cep;
    private String complemento;


    public String dados() {
        return "Logradouro: " + logradouro + "Bairro: " + barrio + "CEP: " + cep + "Complemento: " + complemento;
    }
}
