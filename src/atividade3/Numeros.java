package atividade3;

import java.util.Random;
import java.util.Scanner;

public class Numeros {
    public int tentativas;
    public Random random = new Random();
    public int numero = random.nextInt(100);

    public void jogada() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 0 a 100: ");
        int chute = scanner.nextInt();
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

   


}
