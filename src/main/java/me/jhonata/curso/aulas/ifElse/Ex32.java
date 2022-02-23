package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Especificação   Código  Preço");
        System.out.println("HOTDOG          100     1.20 ");
        System.out.println("BAURU SIMPLES   101     1.30 ");
        System.out.println("BAURU C/ OVO    102     1.50 ");
        System.out.println("HAMBURGUER      103     1.20 ");
        System.out.println("CHEESEBURGUER   104     1.70 ");
        System.out.println("SUCO            105     2.20 ");
        System.out.println("REFRIGERANTE    106     1.00 ");

        int resposta = Integer.parseInt(scanner.nextLine());


        if (resposta == 100) {
            double hotDogPreco = 1.20;
            System.out.println("Quantos Hotdogs você quer?");
            int resposta2 = Integer.parseInt(scanner.nextLine());
            double precoFinal = hotDogPreco * resposta2;
            System.out.println("O preço total será: " + precoFinal);

        } else if (resposta == 101) {
            double bauruSimplesPreco = 1.30;
            System.out.println("Quantos Baurus SIMPLES você quer?");
            int resposta2 = Integer.parseInt(scanner.nextLine());
            double precoFinal = bauruSimplesPreco * resposta2;
            System.out.println("O preço total será: " + precoFinal);

        } else if (resposta == 102) {
            double bauruOvoPreco = 1.50;
            System.out.println("Quantos Baurus C/ OVO você quer?");
            int resposta2 = Integer.parseInt(scanner.nextLine());
            double precoFinal = bauruOvoPreco * resposta2;
            System.out.println("O preço total será: " + precoFinal);

        } else if (resposta == 103) {
            double hamburguer = 1.20;
            System.out.println("Quantos Hamburgueres você quer?");
            int resposta2 = Integer.parseInt(scanner.nextLine());
            double precoFinal = hamburguer * resposta2;
            System.out.println("O preço total será: " + precoFinal);

        } else if (resposta == 104) {
            double cheeseburguer = 1.70;
            System.out.println("Quantos Cheeseburguer's você quer?");
            int resposta2 = Integer.parseInt(scanner.nextLine());
            double precoFinal = cheeseburguer * resposta2;
            System.out.println("O preço total será: " + precoFinal);

        } else if (resposta == 105) {
            double suco = 2.20;
            System.out.println("Quantos sucos você quer?");
            int resposta2 = Integer.parseInt(scanner.nextLine());
            double precoFinal = suco * resposta2;
            System.out.println("O preço total será: " + precoFinal);

        } else if (resposta == 106) {
            double refrigerante = 1.00;
            System.out.println("Quantos refrigerantes você quer?");
            int resposta2 = Integer.parseInt(scanner.nextLine());
            double precoFinal = refrigerante * resposta2;
            System.out.println("O preço total será: " + precoFinal);

        }
        //solved
    }
}
