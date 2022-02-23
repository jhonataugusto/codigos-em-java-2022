package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] vector = new int[6];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            //a
            System.out.println("digite o numero " + i);
            int n = Integer.parseInt(scanner.nextLine());
            vector[i] = n;
        }

        int soma = vector[0] + vector[1] + vector[5];

        //b
        System.out.println(soma);

        //c
        vector[4] = 100;

        //d
        for (int j : vector) {
            System.out.println(j);
        }


        //for(int i : vector){
        //  System.out.println(vector[i]);  eu não tinha imprimido a variavel certa
        // }


    } //solved
}
