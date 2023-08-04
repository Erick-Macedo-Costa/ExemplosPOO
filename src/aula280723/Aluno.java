package aula280723;

public class Aluno {
    //atributos (dados)
    String nome;
    double notaBim1;
    double notaBim2;

    //métodos (comportamentos)
    double media(){
        //instruções
        return (notaBim1 + notaBim2) / 2;
    }

    String situacao(){
        return ( media() < 6 ) ? "Reprovado!" : "Aprovado";
    }

    String dados(){
        return nome + ", Nota1: "+ notaBim1 +
                ", Nota2: " + notaBim2 +
                ", Média: "+ media() +
                ", Situação: "+ situacao();
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Erick";
        aluno1.notaBim1 = 3.7;
        aluno1.notaBim2 = 6;
        System.out.println("aula280723.Aluno: "+aluno1.dados());
    }

}

