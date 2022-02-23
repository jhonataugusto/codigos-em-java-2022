package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inteiros = new int[6];
        for (int i = 0; i < inteiros.length; i++) {
            System.out.println("Digite o numero: " + i);
            int n = Integer.parseInt(scanner.nextLine());
            inteiros[i] = n;
        }

        for (int j : inteiros) {
            System.out.println(j);
        }
    } //solved
}
