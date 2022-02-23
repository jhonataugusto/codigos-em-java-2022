package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
        }
        for (int j : vetor) {
            System.out.printf("%d\n", j);
        }
    }
    //solved
}
