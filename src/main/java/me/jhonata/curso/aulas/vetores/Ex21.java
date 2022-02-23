package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o numero %d do vetor %s: \n", i, "A");
            int n = Integer.parseInt(scanner.nextLine());
            a[i] = n;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o numero %d do vetor %s: \n", i, "B");
            int n = Integer.parseInt(scanner.nextLine());
            b[i] = n;
        }

        int[] c = new int[10];

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] - b[i];
            System.out.printf("%d - %d = %d\n", a[i], b[i], c[i]);
        }
        //solved
    }
}
