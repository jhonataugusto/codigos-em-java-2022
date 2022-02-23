package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int n = Integer.parseInt(scanner.nextLine());
        if (n > 0) {
            double nPow = Math.pow(n, 2);
            System.out.println(nPow);
            double nSqrt = Math.sqrt(n);
            System.out.println(nSqrt);
        }
    }
    //solved

}
