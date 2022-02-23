package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n > 0) {
            String number = String.valueOf(n);
            char[] digits1 = number.toCharArray();
            int soma = 0;
            for (char c : digits1) { // na maioria das vezes,  <= em x.lenght dá ArrayIndexOutOfBounds Exception...
                int conversor = Integer.parseInt(String.valueOf(c));
                soma += conversor;
            }
            System.out.println(soma);
        }
        //solved
    }
}

