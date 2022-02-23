package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Para adição -> [+]");
        System.out.println("Para subtração -> [-]");
        System.out.println("Para multiplicação -> [*]");
        System.out.println("Para divisão -> [/]");

        String n = scanner.nextLine();

        switch (n) {
            case "+" -> {
                System.out.println("Digite o numero 1: ");
                int n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite o numero 2: ");
                int n2 = Integer.parseInt(scanner.nextLine());

                double soma = n1 + n2;
                System.out.println(soma);
            }
            case "-" -> {
                System.out.println("Digite o numero 1: ");
                int n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite o numero 2: ");
                int n2 = Integer.parseInt(scanner.nextLine());

                double sub = n1 - n2;
                System.out.println(sub);
            }
            case "*" -> {
                System.out.println("Digite o numero 1: ");
                int n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite o numero 2: ");
                int n2 = Integer.parseInt(scanner.nextLine());

                double mult = n1 * n2;
                System.out.println(mult);
            }
            case "/" -> {
                System.out.println("Digite o numero 1: ");
                int n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite o numero 2: ");
                int n2 = Integer.parseInt(scanner.nextLine());

                int div = n1 / n2;
                System.out.println(div);
            }

            default -> {
                System.out.println("opção inválida.");
            }
        }
        //solved
    }
}
