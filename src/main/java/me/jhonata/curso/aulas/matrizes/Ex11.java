package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();

        int soma = 0;
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = random.nextInt(1, 10);
                matriz[i][j] = n;
                System.out.printf("%d   ", matriz[i][j]);

            }
            System.out.println("\n");
        }

        for (int i = 0; i < 3; i++) {
            soma += matriz[i][matriz.length - 1 - i];
        }

        System.out.println(soma);
    }
}
