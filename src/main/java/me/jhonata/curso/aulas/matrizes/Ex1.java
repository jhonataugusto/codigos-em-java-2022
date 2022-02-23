package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int valoresMaioresQue10 = 0;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println("digite a posição: [" + i + "][" + j + "]");
                int n2 = Integer.parseInt(scanner.nextLine());
                matriz[i][j] = n2;
                if (matriz[i][j] > 10) {
                    valoresMaioresQue10++;
                }
            }
        }
        System.out.println(valoresMaioresQue10);
    }
    //solved
}
