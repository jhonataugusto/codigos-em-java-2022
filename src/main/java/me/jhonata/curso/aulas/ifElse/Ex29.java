package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Random;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int perguntasAcertadas = 0;
        int perguntasErradas = 0;

        for (int i = 5; i >= 1; i--) {
            int x = random.nextInt(1, 100);
            int z = random.nextInt(1, 100);

            System.out.print("qual a soma de " + x + " + " + z + " = ");
            int resposta = Integer.parseInt(scanner.nextLine());
            int respostaCorreta = x + z;

            if (resposta == respostaCorreta) {
                perguntasAcertadas++;
                System.out.println();
                System.out.println("Você acertou!");
                System.out.println("a resposta de : " + x + " + " + z + " = " + respostaCorreta);

            } else {
                perguntasErradas++;
                System.out.println("Que pena, você errou!");
                System.out.println();
                System.out.println("a resposta de : " + x + " + " + z + " = " + respostaCorreta);
                System.out.println("Você digitou: " + resposta);
            }
            System.out.println("Você tem " + (i - 1) + " vezes restantes");
            System.out.println();
        }
        System.out.println("Perguntas acertadas: " + perguntasAcertadas);
        System.out.println("Perguntas erradas: " + perguntasErradas);
    }
    //solved
}
