package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] matriz3 = new int[4][4];
//        0,0,0,16
//        0,0,22,0
//        0,34,0,0
//        0,78,0,0

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite um numero [%d][%d] : ", i, j);
                int n = Integer.parseInt(s.nextLine());
                matriz1[i][j] = n;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite um numero [%d][%d] : ", i, j);
                int n = Integer.parseInt(s.nextLine());
                matriz2[i][j] = n;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz3[i][j] = Math.max(matriz1[i][j], matriz2[i][j]);
                System.out.printf("%d   ", matriz3[i][j]);
            }
            System.out.print("\n");
        }

        //solved
    }
}
