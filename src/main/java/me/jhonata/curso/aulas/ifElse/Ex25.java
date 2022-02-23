package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o valor de B:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o valor de C:");
        int c = Integer.parseInt(scanner.nextLine());

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
        double x2 = ((-b - Math.sqrt(delta)) / (2 * a));

        if (delta < 0) {
            System.out.println("não existe raiz.");
        } else if (delta == 0) {
            System.out.println("raiz única");
        } else if (delta >= 0) {
            System.out.println("x1 : " + x1);
            System.out.println("x2 : " + x2);
        }
    } //solved
}
