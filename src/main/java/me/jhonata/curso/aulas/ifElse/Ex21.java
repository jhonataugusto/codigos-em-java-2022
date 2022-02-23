package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Soma de 2 números.");
        System.out.println("2 - Diferença entre 2 números (maior pelo menor).");
        System.out.println("3 - Produto entre 2 números."); //multiplicação
        System.out.println("4 - Divisão entre 2 números. (O denominador não pode ser zero).");

        int n = Integer.parseInt(scanner.nextLine());

        switch (n) {
            case 1:
                System.out.println("Digite um numero: ");
                int n1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite outro número: ");
                int n2 = Integer.parseInt(scanner.nextLine());

                int soma = n1 + n2;
                System.out.println(soma);

                break;
            case 2:

                System.out.println("Digite um numero: ");
                int z1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite outro número: ");
                int z2 = Integer.parseInt(scanner.nextLine());

                int diferenca = z1 - z2;
                System.out.println(diferenca);

                break;
            case 3:

                System.out.println("Digite um numero: ");
                int y1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite outro número: ");
                int y2 = Integer.parseInt(scanner.nextLine());

                int produto = y1 * y2;
                System.out.println(produto);

                break;
            case 4:

                System.out.println("Digite um numero: ");
                int x1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Digite outro número: ");
                int x2 = Integer.parseInt(scanner.nextLine());

                int divisao = x1 / x2;

                System.out.println(divisao);


                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    } //solved
}
