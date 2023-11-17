package atividade7;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private String telefone;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(String nome, String telefone, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.telefone = telefone;
        this.funcionarios = funcionarios;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

public String dados() {
        String dados = "Nome: " + nome + "\nTelefone: " + telefone + "\nFuncionários: " ;
        for (Funcionario funcionarios : funcionarios) {
            dados += "\n" + funcionarios.dados();
        }
        return dados;
    }



}
