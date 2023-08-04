import aula040823.PessoaFisica;
import aula280723.Aluno;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exemplos!");
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Erick";
        aluno1.notaBim1 = 3.7;
        aluno1.notaBim2 = 6;
        System.out.println("Aluno: "+aluno1.dados());

        System.out.println("\n ");

        PessoaFisica pf1 = new PessoaFisica();
        pf1.nome = "Erick";
        pf1.cpf = "12345678900";
        pf1.dataNascimento = java.time.LocalDate.of(2002, 2, 20);
        System.out.println("PessoaFisica: "+pf1.dados());


    }
}