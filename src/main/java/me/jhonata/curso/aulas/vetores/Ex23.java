package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] v1 = new double[5];
        double[] v2 = new double[5];
        double[] v3 = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("[%d] 1 > :", i);
            double n = Double.parseDouble(scanner.nextLine());
            v1[i] = n;
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("[%d] 2 > :", i);
            double n = Double.parseDouble(scanner.nextLine());
            v2[i] = n;
        }

        double aux = 0;
        for (int i = 0; i < 5; i++) {
            v3[i] = v1[i] * v2[i];
            aux += v3[i];
        }
        System.out.println("produto escalar: " + aux);
    }

    //solved
}
