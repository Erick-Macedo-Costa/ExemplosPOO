package atividade2;

public class PrincipalBanco {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Programador", 3500.0, 1000.0,10);
        Emprestimo emprestimo = new Emprestimo(cliente, 10);
        System.out.println(cliente.dados());
        System.out.println(emprestimo.dados());
    }
}
