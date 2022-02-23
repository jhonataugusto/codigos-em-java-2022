package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n = Integer.parseInt(scanner.nextLine());
        if (n > 0) {
            double raizquadrada = Math.sqrt(n);
            System.out.println(raizquadrada);
        } else {
            System.out.println("numero inválido.");
        }
    } // solved
}
