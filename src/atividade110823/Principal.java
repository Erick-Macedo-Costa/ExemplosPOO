package atividade110823;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Programador", 3000.0, 500.0,10);
        Emprestimo emprestimo = new Emprestimo(cliente, 10);
        System.out.println(cliente.dados());
        System.out.println(emprestimo.dados());
    }
}
