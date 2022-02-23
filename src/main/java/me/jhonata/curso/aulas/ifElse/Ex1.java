package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("digite outro numero");
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n > n2) {
            System.out.println(n + " é maior do que " + n2);
        } else if (n2 > n) {
            System.out.println(n2 + " é maior do que " + n);
        }
        //solved


    }
}
