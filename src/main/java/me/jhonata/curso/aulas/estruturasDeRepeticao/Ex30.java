package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sequencia 1: ");
        System.out.println("Digite um numero: ");
        int n = Integer.parseInt(scanner.nextLine());
        int soma = 0;
        for (int i = 0; i <= n; i++) {

            soma += n;
            System.out.println("resultado da sequencia 1: " + n);
        }


        System.out.println("Sequencia 2: ");
        System.out.println("digite um numero: ");
        n = Integer.parseInt(scanner.nextLine());

        int soma2 = 0;
        for (int i = 0; i <= (2 * n - 1); i += 1) {
            if (i % 2 == 0) {
                soma2 -= i;
                System.out.println(i);
            } else {
                soma2 += i;
                System.out.println(i);
            }
        }
        System.out.println("soma: " + soma2);

        System.out.println("Sequencia 3:");
        System.out.println("digite um numero: ");
        n = Integer.parseInt(scanner.nextLine());

        soma2 = 0;
        for (int i = 0; i <= (2 * n - 1); i += 2) {
            soma2 += i;
        }
        System.out.println("soma: " + soma2);
    }

    //i don't know if this be correctly
}
