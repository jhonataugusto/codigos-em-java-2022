package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] > ", i + 1);
            int n = Integer.parseInt(scanner.nextLine());
            if (n > 0) {
                vetor[i] = n;
            } else {
                vetor[i] = 0;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] > [%d]\n", i, vetor[i]);
        }
        //solved
    }
}
