package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double[] reais = new double[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < reais.length; i++) {
            System.out.println("Digite o numero " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            reais[i] = Math.pow(n, 2);
        }

        for (double j : reais) {
            System.out.println(j);
        }

        //solved
    }
}
