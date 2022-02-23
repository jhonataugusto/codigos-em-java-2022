package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];

        for (int i = 0; i < vet1.length; i++) {
            System.out.printf("[%d] vet1 > : ", i);
            int n = Integer.parseInt(scanner.nextLine());
            vet1[i] = n;
        }

        for (int i = 0; i < vet2.length; i++) {
            System.out.printf("[%d] vet2 > : ", i);
            int n = Integer.parseInt(scanner.nextLine());
            vet2[i] = n;
        }

        for (int i = 0; i < vet1.length; i++) {
            if (i % 2 == 0) {
                vet3[i] = vet1[i];
            } else {
                vet3[i] = vet2[i];
            }
        }

        for (int x : vet3) {
            System.out.println(x);
        }
    }

    //solved
}
