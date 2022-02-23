package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite a posição : " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            vetor[i] = n;
        }

        System.out.println("Numeros repetidos");
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) { // eu acho que o +1 é pra ele não verificar com ele mesmo...
                if (vetor[i] == vetor[j]) {
                    aux = vetor[i];
                    System.out.println(aux);
                }
            }
        } //solved?
    }
}
