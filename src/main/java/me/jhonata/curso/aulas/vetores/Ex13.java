package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int menor = 9999, maior = 0;
        int posMenor = 0, posMaior = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero : " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            vetor[i] = n;

            if (n > maior) {
                maior = n;
                posMaior = i;
            } else if (n < menor) {
                menor = n;
                posMenor = i;
            }

        }

        System.out.println("Posição maior: " + posMaior);
        System.out.println("Posição menor: " + posMenor);
        //solved

    }
}
