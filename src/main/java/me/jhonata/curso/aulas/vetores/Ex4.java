package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[8];

        for (int i = 0; i < vector.length; i++) {
            System.out.println("digite o numero " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            vector[i] = n;
        }


        int soma = vector[3] + vector[4];
        System.out.println("soma da posição de 3  e 4 : " + soma);

        //solved?

    }
}
