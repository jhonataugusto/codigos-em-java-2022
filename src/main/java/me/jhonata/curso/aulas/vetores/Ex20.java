package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[10];
        int[] intsImpares = new int[10];
        for (int i = 0; i < ints.length; i++) {
            System.out.printf("Digite o numero %d : ", (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            if (n > 0 && n <= 50) {
                ints[i] = n;
            }
        }

        for (int i = 0; i < intsImpares.length; i++) {
            if (i % 2 == 0) {
                intsImpares[i] = ints[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d   %d\n", ints[i], intsImpares[i]);
        }
    }
    //solved
}
