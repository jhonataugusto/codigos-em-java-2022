package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDigitado;
        int soma = 0;
        for (int i = 10; i > 0; i--) {
            System.out.print("digite o numero " + i + ": ");
            numeroDigitado = Integer.parseInt(scanner.nextLine());
            soma = soma + numeroDigitado;
        }
        System.out.println("soma de todos os numeros: " + soma);

    } //solved
}
