package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero positivo: ");
        int n = Integer.parseInt(scanner.nextLine());
        int soma = 0;

        if (n > 0) {
            for (int i = 0; i <= n; i++) {
                soma = soma + i;
            }
            System.out.println("resultado: " + soma);
        } else {
            System.out.println("o numero é negativo.");
        }
        //solved
    }
}
