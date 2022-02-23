package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                vetor[i] = n;
            }
        }

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
    //solved
}
