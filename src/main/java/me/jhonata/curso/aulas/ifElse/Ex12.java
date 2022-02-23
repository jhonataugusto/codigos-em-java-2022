package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 0) {
            System.out.println("numero invalido.");
        } else {
            double logN = Math.log(n);
            System.out.println(logN);
        }
    }
    //solved??
}
