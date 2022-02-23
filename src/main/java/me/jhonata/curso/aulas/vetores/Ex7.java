package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorNumero = 0;
        int posVetor = 0;
        int[] vetor = new int[10];


        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero: " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            vetor[i] = n;
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorNumero) {
                maiorNumero = vetor[i];
                posVetor = i;
            }
        }

        System.out.println("O maior numero foi: " + maiorNumero);
        System.out.println("A posição do vetor se encontra em : " + posVetor);

    } //solved
}
