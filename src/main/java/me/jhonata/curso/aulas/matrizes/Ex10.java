package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Random;

public class Ex10 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random r = new Random();
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = r.nextInt(1, 100);
                matriz[i][j] = n;
                System.out.printf("%d   ", matriz[i][j]);
                if (i == j) {
                    soma += matriz[i][j];
                }
            }
            System.out.print("\n");
        }
        System.out.println("soma: " + soma);
    }
}
