package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 == 0) {
            System.out.println("esse numero é par.");
        } else {
            System.out.println("esse número é impar.");
        }
    }
    //solved
}
