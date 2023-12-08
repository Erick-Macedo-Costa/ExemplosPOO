package atividade8;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Athus", "12121212122");
        Pessoa p2 = new Pessoa("Erik", "4744545455");
        Pessoa p3 = new Pessoa("Daniel", "78887878887");
        Pessoa p4 = new Pessoa("José", "12115151515");
        Pessoa p5 = new Pessoa("Matheus", "226526215");

        Funcionario f1 = new Funcionario(p1.getNome(), p1.getCpf(), "0211");
        Funcionario f2 = new Funcionario(p1.getNome(), p1.getCpf(), "0211");


        Cliente c1 = new Cliente(p2.getNome(), p2.getCpf(), "454544545");
        Cliente c2 = new Cliente(p3.getNome(), p3.getCpf(), "8585859566");


        Veiculo v1 = new Veiculo("Toyota", "Corolla", 2016, 200.0, 4);
        Veiculo v2 = new Veiculo("Fiat", "Argo", 2023, 180.0, 1);
        Veiculo v3 = new Veiculo("Chevrolet", "Celta", 2012, 100.0, 2);
        Veiculo v4 = new Veiculo("Chevrolet", "Cruze", 2022, 290.0, 1);

        Locadora l1 = new Locadora("Localiza", "121212121212");
        Locadora l2 = new Locadora("Movida", "454545454545");

        l1.veiculos.add(v1);
        l1.veiculos.add(v2);

        l2.veiculos.add(v3);
        l2.veiculos.add(v4);

        l1.pessoas.add(f1);
        l1.pessoas.add(c1);
        l2.pessoas.add(f2);
        l2.pessoas.add(c2);

//        System.out.println(l1.dados() + "\n");
//        System.out.println(l2.dados() + "\n");

        Locacao locacao1 = new Locacao(v1, c1, f1, 5);
        Locacao locacao2 = new Locacao(v2, c2, f2, 3);
        Locacao locacao3 = new Locacao(v3, c1, f1, 2);
        Locacao locacao4 = new Locacao(v4, c2, f2, 1);

        ArrayList<Locacao> locacoes = new ArrayList<>();
        locacoes.add(locacao1);
        locacoes.add(locacao2);
        locacoes.add(locacao3);
        locacoes.add(locacao4);

        for (Locacao locacao : locacoes) {
            System.out.println(locacao.dados() + "\n");
        }



    }
}
