package atividade7;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razaoSocial;
    private String cnpj;
    private List<Departamento> departamentos = new ArrayList<>();

    public Empresa(String razaoSocial, String cnpj, List<Departamento> departamentos) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.departamentos = departamentos;
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

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public String dados() {
        String dados = "Razão Social: " + razaoSocial + "\nCNPJ: " + cnpj + "\nDepartamentos:";
        for (Departamento departamento : departamentos) {
            dados += "\n" + departamento.dados();
        }
        return dados;
    }

    public String departamentos(){
        for (Departamento departamento : departamentos) {
            return departamento.dados();
        }
        return null;
    }
    public String funcionario(Funcionario funcionario){
        return funcionario.dados();
    }
}



