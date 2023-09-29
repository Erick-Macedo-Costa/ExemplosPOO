package atividade4;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Endereco endereco1 = new Endereco();
        Cidade cidade1 = new Cidade();
        Estado estado1 = new Estado();

        pessoa1.nome = "Erick";
        pessoa1.dataNascimento = LocalDate.of(2002, 2, 20);
        pessoa1.endereco = endereco1;

        endereco1.logradouro = "Quadra 111, Av Lo 27, Lote 25, QI 14";
        endereco1.barrio = "Centro";
        endereco1.cep = 12345678;
        endereco1.complemento = "APT 1";
        endereco1.cidade = cidade1;

        cidade1.nome = "Palmas";
        cidade1.estado = estado1;

        estado1.nome = "Tocatins";
        estado1.sigla = "TO";

        System.out.println(pessoa1.dados());
    }
}
