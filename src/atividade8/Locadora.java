package atividade8;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private String razaoSocial;
    private String cnpj;
    public List<Veiculo> veiculos = new ArrayList<>();
    public List<Pessoa> pessoas = new ArrayList<>();
    public Veiculo veiculo;

    public Locadora(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String dados() {
        String dadosLoca = "Razão Social: " + this.razaoSocial + "\nCNPJ: " + this.cnpj + "\n";

        for (Veiculo veiculo : veiculos) {
            dadosLoca += veiculo.dados() + "\n";
        }
        for (Pessoa pessoa : pessoas) {
            dadosLoca += pessoa.dados() + "\n";
        }
        return dadosLoca;
    }

}
