package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = i * j;
                System.out.printf("%d   ", matriz[i][j]);
            }
            System.out.print("\n");
        }
        //solved
    }
}
