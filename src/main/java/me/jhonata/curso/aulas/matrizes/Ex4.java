package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner s = new Scanner(System.in);
        int maior = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite um numero [%d][%d] : ", i, j);
                int n = Integer.parseInt(s.nextLine());
                matriz[i][j] = n;
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d   ", matriz[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.println("O numero maior é = " + maior);

        //solved
    }
}
