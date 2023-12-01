package atividade9;

public class Principal {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtrair = new Subtrair();
        OperacaoMatematica dividir = new Dividir();
        OperacaoMatematica multiplicar = new Multiplicar();

        imprimirOperacoes(soma);
        imprimirOperacoes(subtrair);
        imprimirOperacoes(dividir);
        imprimirOperacoes(multiplicar);

    }
    public static void imprimirOperacoes(OperacaoMatematica acoesMatematica){
        System.out.println(acoesMatematica.calcular(10, 5));
    }
}
