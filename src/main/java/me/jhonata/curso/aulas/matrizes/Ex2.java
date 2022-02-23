package main.java.me.jhonata.curso.aulas.matrizes;

public class Ex2 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                System.out.printf("%d   ", matriz[i][j]);
            }
            System.out.print("\n");
        }

        //solved
    }
}
