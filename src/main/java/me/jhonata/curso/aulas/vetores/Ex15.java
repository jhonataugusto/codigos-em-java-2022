package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int aux = 0;


        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o numero %d: ", (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            numeros[i] = n;
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    aux = numeros[i];
                    System.out.println("NUMEROS REMOVIDOS: " + aux);
                    numeros[i] = 0;
                }
            }
        }
        //solved
    }
}
