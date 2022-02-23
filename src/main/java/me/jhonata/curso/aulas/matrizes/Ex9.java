package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[3][3];
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(1, 100);
                System.out.printf("%d   ", matriz[i][j]);
            }
            System.out.print("\n");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    for (int k = i; k < 3; k++) {
                        if (k != 2) {
                            soma += matriz[k + 1][j];
                        }
                    }
                }
            }
        }
        System.out.println("soma =" + soma);
        //solved
    }
}
