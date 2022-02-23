package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Random;

public class Ex12 {
    public static void main(String[] args) {
        // 1 2 3
        // 4 5 6
        // 7 8 9


        // 1 4 7
        // 2 5 8
        // 3 6 9

        Random r = new Random();
        int[][] m = new int[3][3];
        int[][] mt = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = r.nextInt(0, 10);
                m[i][j] = n;
                System.out.printf("%d   ", m[i][j]);
            }
            System.out.print("\n");
        }

        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mt[i][j] = m[j][i];
                System.out.printf("%d   ", mt[i][j]);
            }
            System.out.print("\n");
        }
    }
}
