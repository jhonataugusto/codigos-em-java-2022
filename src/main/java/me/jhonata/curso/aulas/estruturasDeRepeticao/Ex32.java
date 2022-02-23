package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        double d1, d2;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas vezes voce quer lançar os dois dados?? :");
        n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            d1 = Math.round(Math.random());
            d2 = Math.round(Math.random());

            if (d1 < d2) {
                System.out.println("D1 é maior do que D2");
                System.out.println("D1 = " + d1);
                System.out.println("D2 = " + d2);

            } else if (d2 < d1) {
                System.out.println("D2 é maior do que D1");
                System.out.println("D1 = " + d1);
                System.out.println("D2 = " + d2);
            } else {
                System.out.println("os dados são iguais:");
                System.out.println("D1 = " + d1);
                System.out.println("D2 = " + d2);
            }
        }
    }
}