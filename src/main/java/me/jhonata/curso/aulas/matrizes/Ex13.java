package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
        //matriz triangular inferior
        Random r = new Random();
        int[][] m = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int n = r.nextInt(1, 9);
                m[i][j] = n;
                System.out.printf("%d   ", m[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    m[i][j] = 0;
                }
                System.out.printf("%d   ", m[i][j]);
            }
            System.out.print("\n");
        }
    }
}
