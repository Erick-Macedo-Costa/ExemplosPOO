package atividade110823;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "Programador", 2000.0, 1000.0,10);
        Emprestimo emprestimo = new Emprestimo(cliente, 1000.0);
        System.out.println(emprestimo.dados());
    }
}
