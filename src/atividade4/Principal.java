package atividade4;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();
        Cidade cidade = new Cidade();
        Estado estado = new Estado();

        pessoa.nome = "Erick";
        pessoa.dataNascimento = java.time.LocalDate.of(2002, 2, 20);
        pessoa.endereco = endereco;

        endereco.logradouro = "Rua 1, Quadra 1, Lote 1";
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
