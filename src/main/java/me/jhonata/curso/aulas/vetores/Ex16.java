package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero: " + (i + 1));
            double n = Double.parseDouble(scanner.nextLine());
            vetor[i] = n;
        }

        System.out.println("[1] - para mostrar vetor na ordem direta");
        System.out.println("[2] - para mostrar vetor na ordem indireta");
        int r = Integer.parseInt(scanner.nextLine());
        switch (r) {
            case 1:
                for (double i : vetor) {
                    System.out.println(i);
                }
                break;
            case 2:
                for (int i = vetor.length - 1; i >= 0; i--) {
                    System.out.println(vetor[i]);
                }
                break;
            default:
                System.out.println("Comando inválido");
                break;
        }
        //solved
    }
}
