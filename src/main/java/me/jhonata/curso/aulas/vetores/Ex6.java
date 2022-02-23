package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorValor = 0;
        int menorValor = 9999;

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero: " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            vetor[i] = n;
        }

        for (int j : vetor) {
            if (j > maiorValor) {
                maiorValor = j;
            } else if (j < menorValor) {
                menorValor = j;
            }
        }


        System.out.println("maior valor do vetor : " + maiorValor);
        System.out.println("menor valor do vetor : " + menorValor);

        //solved
    }


}
