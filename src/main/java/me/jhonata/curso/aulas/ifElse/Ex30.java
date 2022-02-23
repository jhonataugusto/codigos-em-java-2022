package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[3];

        for (int i = 0; i < n.length; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            n[i] = Integer.parseInt(scanner.nextLine());
        }

        Arrays.sort(n);

        for (int j : n) {
            System.out.println(j);
        }

    } // solved
}
