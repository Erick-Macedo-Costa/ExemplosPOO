package atividade7;

import java.util.List;

public class Principal {
public static void main(String[] args) {
    Funcionario funcionario = new Funcionario("Erick", 1000);
    Funcionario funcionario2 = new Funcionario("Carlos", 1500);
    Funcionario funcionario3 = new Funcionario("João", 2000);
    Gerente gerente = new Gerente(funcionario.getNome(), 1500);
    gerente.setGratificacao("500");
    Gerente gerente2 = new Gerente(funcionario3.getNome(), 2000);
    gerente2.setGratificacao("1000");
    Estagiario estagiario = new Estagiario(funcionario2.getNome(), 1000);
    estagiario.setCurso("Ciência da Computação");
    Departamento departamento = new Departamento("RH", "123456789", List.of(funcionario,funcionario2, gerente, estagiario));
    Departamento departamento2 = new Departamento("TI", "123456789", List.of(funcionario2,funcionario3,gerente2, estagiario));
    Empresa empresa = new Empresa("Empresa COn ", "123456789", List.of(departamento, departamento2));
    System.out.println(empresa.dados());
    //System.out.println(empresa.departamentos());
    //System.out.println(empresa.funcionario(funcionario3));
    }
}
