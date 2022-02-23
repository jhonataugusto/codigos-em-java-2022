package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite o numero : " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            vector[i] = n;
        }

        System.out.println("um vetor tem : " + vector.length + " posições!");

        //solved
    }
}
