package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int[] vetor = new int[5];
        Scanner scanner = new Scanner(System.in);
        int soma = 0, media, maior = 0, menor = 9999;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero: " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            vetor[i] = n;

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            soma += vetor[i];
        }

        media = soma / vetor.length;
        System.out.println("media = " + media);
        System.out.println("maior = " + maior);
        System.out.println("menor = " + menor);
        //solved
    }
}
