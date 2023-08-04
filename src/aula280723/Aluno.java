package aula280723;

public class Aluno {
    //atributos (dados)
    public String nome;
    public double notaBim1;
    public double notaBim2;

    //métodos (comportamentos)
    double media(){
        //instruções
        return (notaBim1 + notaBim2) / 2;
    }

    String situacao(){

        //condiçao ? valor_se_verdadeiro : valor_se_falso
        return ( media() < 6 ) ? "Reprovado!" : "Aprovado";
    }

    public String dados(){
        return nome + ", Nota1: "+ notaBim1 +
                ", Nota2: " + notaBim2 +
                ", Média: "+ media() +
                ", Situação: "+ situacao();
    }

}

