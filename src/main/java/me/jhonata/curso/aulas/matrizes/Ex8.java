package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        int soma = 0;
        Random random = new Random();
        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(1, 100);
                System.out.printf("%d   ", matriz[i][j]);
                for (int k = i; k > 0; k--) {
                    if (i == j) {
                        soma += matriz[k - 1][j];
                    }
                }
            }
            System.out.print("\n");
        }
        System.out.println(soma + "<-");
    }
    //solved
}
