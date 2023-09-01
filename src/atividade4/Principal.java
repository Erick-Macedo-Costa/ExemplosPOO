package atividade4;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        pessoa.nome = "Erick";
        pessoa.dataNascimento = LocalDate.of(2002, 2, 20);
        pessoa.endereco = endereco;

        endereco.logradouro = "Quadra 111, Av Lo 27, Lote 25, QI 14";
        endereco.barrio = "Centro";
        endereco.cep = 12345678;
        endereco.complemento = "APT 1";
        endereco.cidade = cidade;

        cidade.nome = "Palmas";
        cidade.estado = estado;

        estado.nome = "Tocatins";
        estado.sigla = "TO";

        System.out.println(pessoa.dados());
    }
}
