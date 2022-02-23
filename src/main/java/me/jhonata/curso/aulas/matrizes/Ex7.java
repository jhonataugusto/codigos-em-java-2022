package main.java.me.jhonata.curso.aulas.matrizes;

public class Ex7 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    matriz[i][j] = ((2 * i) + (7 * j)) - 2;
                } else if (i == j) {
                    matriz[i][j] = (3 * (int) Math.pow(i, 2)) - 1;
                } else {
                    matriz[i][j] = (4 * (int) Math.pow(i, 3)) - (5 * (int) Math.pow(i, 2)) + 1;
                }
                System.out.printf("%d   ", matriz[i][j]);
            }
            System.out.print("\n");
            //solved
        }
    }
}
