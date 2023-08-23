package atividade3;

import java.util.Random;
import java.util.Scanner;

public class Numero {
    public int tentativas=0;
    public Random random = new Random();
    public int numero = random.nextInt(100);

    public void jogada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 100: ");
        int chute = scanner.nextInt();
        tentativas = 0;
            if (chute == numero) {
                System.out.println("Acertou!");
            } else if (chute > numero) {
                System.out.println("Errou, e menor que: " + chute);
                jogada();
            } else {
                System.out.println("Errou, e maior que: " + chute);
                jogada();
            }
        tentativas++;
    }

//    public void jogada() {
//        Scanner scanner = new Scanner(System.in);
//        int chute=0;
//        do {
//            System.out.println("Digite um numero de 0 a 100: ");
//            chute = scanner.nextInt();
//            if (chute == numero)
//                System.out.println("Acertou!");
//             else if (chute > numero)
//                System.out.println("Errou, e menor que: " + chute);
//            else
//                System.out.println("Errou, e maior que: " + chute);
//            tentativas++;
//        } while (chute != numero);
//    }
    public String dados() {
        return "Numero sorteado: " + numero + "\n" + "Quantidade de tentativas: " + tentativas;
    }


}
