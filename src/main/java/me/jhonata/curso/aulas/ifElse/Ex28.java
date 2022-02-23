package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero X: ");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o numero Y: ");
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o numero Z: ");
        int z = Integer.parseInt(scanner.nextLine());

        System.out.println("Para média Geométrica -> [1]");
        System.out.println("Para média Ponderada  -> [2]");
        System.out.println("Para média Harmônica  -> [3]");
        System.out.println("Para média Aritmética -> [4]");

        int resposta = Integer.parseInt(scanner.nextLine());

        switch (resposta) {
            case 1 -> {
                double mediaGeometrica = Math.cbrt(x * y * z);
                System.out.println("Média geométrica: " + mediaGeometrica);
            }
            case 2 -> {
                int mediaPonderada = ((x + (2 * y) + (3 * z)) / 6);
                System.out.println("Média ponderada: " + mediaPonderada);
            }
            case 3 -> {
                int mediaHarmonica = 1 / ((1 / x) + (1 / y) + (1 / z));
                System.out.println("Média harmônica: " + mediaHarmonica);
            }
            case 4 -> {
                int mediaAritmetica = (x + y + z) / 3;
                System.out.println("Média aritmética: " + mediaAritmetica);
            }
            default -> System.out.println("opção inválida.");
        }
        //solved
    }
}
