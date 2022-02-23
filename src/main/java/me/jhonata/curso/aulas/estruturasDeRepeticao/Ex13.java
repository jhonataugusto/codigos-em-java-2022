package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero inteiro positivo par : ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 == 0 && n > 0) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Esse numero nao e par ou nao e positivo.");
        }
        //solved
    }
}
