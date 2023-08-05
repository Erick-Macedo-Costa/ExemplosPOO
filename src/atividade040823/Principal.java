package atividade040823;

public class Principal {
    public static void main(String[] args) {
        //EXERCICIO 1
        Produto produto1 = new Produto();
        produto1.descricao = "Maça ";
        produto1.valor = 5;
        produto1.percentualDesconto = 0.1;
        System.out.println(produto1.dados  ());

        System.out.println("\n");

        Produto produto2 = new Produto();
        produto2.descricao = "Banana ";
        produto2.valor = 2;
        produto2.percentualDesconto = 0.1;
        System.out.println(produto2.dados());
        //FIM DO EXERCICIO 1

        System.out.println("\n");

        //EXERCICIO 2
        Conta conta1 = new Conta("João ", 1000, 500);
        System.out.println(conta1.retornarDados());
        conta1.sacar(700);
        conta1.depositar(200);
        System.out.println("Novos dados da conta 1: " + "\n" + conta1.retornarDados());

        System.out.println("\n");

        Conta conta2 = new Conta("Maria ", 2000, 1000);
        System.out.println(conta2.retornarDados());
        conta2.sacar(3000);
        conta2.depositar(500);
        System.out.println("Novos dados da conta 2: " + "\n" + conta2.retornarDados());

    }
}
