package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o lado A: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o lado B: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o lado C: ");
        int c = Integer.parseInt(scanner.nextLine());

        if ((a < b + c) || (b < a + c) || (c < b + a)) {
            if (a == b && a == c) { //equilátero
                System.out.println("equilatero");
            } else if (a == b || b == c || c == a) {
                System.out.println("isósceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("isso não é um triangulo!");
        }
        //solved
    }
}
