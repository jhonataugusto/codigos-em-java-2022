package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Random;
import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(1, 1000);
        int resposta;
        int tentativas = 0;
        do {
            System.out.println("");
            System.out.println("=================================================");
            System.out.println("Digite um numero aleatorio para tentar acertar!");
            System.out.println("=================================================");
            System.out.println("");
            resposta = Integer.parseInt(scanner.nextLine());

            if (resposta > x) {
                System.out.println("ERROU!");
                System.out.println("O numero que voce colocou é maior que a resposta...");
                tentativas++;
            } else if (resposta < x) {
                System.out.println("ERROU");
                System.out.println("O numero que voce colocou é menor que a resposta...");
                tentativas++;
            }
        } while (resposta != x);
        System.out.println("Parabéns! Você acertou!");
        System.out.println("Numero digitado: " + resposta);
        System.out.println("Numero coringa: " + x);
        System.out.println("Numero de tentativas: " + tentativas);

        //solved
    }
}
