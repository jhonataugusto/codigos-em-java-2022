package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int soma = 0;
        int media = 0;
        int quantidadeDePositivos = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.println("digite o numero " + (i + 1) + ": ");
            numeroDigitado = Integer.parseInt(scanner.nextLine());
            if (numeroDigitado > 0) {
                System.out.println("ok");
                soma = soma + numeroDigitado;
                quantidadeDePositivos++;
            }
        }
        media = soma / quantidadeDePositivos;
        System.out.println("sua media: " + media);
    }
    //solved
}
