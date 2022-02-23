package main.java.me.jhonata.curso.aulas.matrizes;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int numero = 0;
        int[] localizacao = new int[2];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite um numero [%d][%d] : ", i, j);
                int n = Integer.parseInt(s.nextLine());
                matriz[i][j] = n;
            }
        }

        System.out.print("Digite um numero : ");
        int x = Integer.parseInt(s.nextLine());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    numero = matriz[i][j];
                    localizacao[0] = i;
                    localizacao[1] = j;
                }
            }
        }

        if (numero != 0) {
            System.out.println("Numero encontrado ! = " + numero);
            System.out.print("Localização : ");
            for (int k : localizacao) {
                System.out.printf("[%d]", k);
            }
        } else {
            System.out.println("Numero não encontrado.");
        }

        //solved
    }
}
