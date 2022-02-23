package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua primeira nota: ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("digite sua segunda nota: ");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println("digite sua terceira nota: ");
        int n3 = Integer.parseInt(scanner.nextLine());

        int media = ((n1 + n2 + n3) / 3);

        if (media >= 0 && media <= 2.9) {
            System.out.println("reprovado.");
        } else if (media >= 3 && media <= 4.9) {
            System.out.println("recuperação");
        } else {
            System.out.println("aprovado!");
        }
    }
    //solved
}
