package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int soma = 0;
        int media = 0;
        for (int i = 0; i <= 9; i++) {
            System.out.println("digite o numero " + (i + 1) + ": ");
            numeroDigitado = Integer.parseInt(scanner.nextLine());
            soma = soma + numeroDigitado;
            if (i == 9) {
                media = soma / 10;
            }
        }

        System.out.println("media: " + media);
    }
    //solved
}
