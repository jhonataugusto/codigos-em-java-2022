package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o segundo numero:");
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n > n2) {
            System.out.println(n + " é maior que " + n2);
            int dif = n - n2;
            System.out.println("a diferença é de : " + dif);
        } else if (n2 > n) {
            System.out.println(n2 + " é maior que " + n);
            int dif = n2 - n;
            System.out.println("a diferença é de: " + dif);
        }

    }
    //solved
}
