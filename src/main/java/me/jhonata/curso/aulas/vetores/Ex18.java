package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] > ", (i + 1));
            int x = Integer.parseInt(scanner.nextLine());
            vetor[i] = x;
        }

        for (int k : vetor) { // args.length... sério? SDKJASDJKASJKD
            System.out.printf("Multiplos de %d\n", k);
            for (int j = 1; j <= 10; j++) {
                int mult = k * j;
                System.out.printf("%d x %d = %d\n", k, j, mult);
            }
        }
        //solved
    }
}
