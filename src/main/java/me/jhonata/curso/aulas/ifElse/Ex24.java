package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preco do produto");
        int precoInicial = Integer.parseInt(scanner.nextLine());

        double impostoMG = precoInicial + (precoInicial * 0.07);
        double impostoSP = precoInicial + (precoInicial * 0.12);
        double impostoRJ = precoInicial + (precoInicial * 0.15);
        double impostoMS = precoInicial + (precoInicial * 0.08);

        System.out.println("Para São Paulo / SP -> [1]");
        System.out.println("Para Minas Gerais / MG -> [2]");
        System.out.println("Para Rio de Janeiro / RJ -> [3]");
        System.out.println("Para Mato Grosso do Sul / MG -> [4]");

        int estado = Integer.parseInt(scanner.nextLine());

        switch (estado) {
            case 1 -> System.out.println("preço final para SP : " + impostoSP);
            case 2 -> System.out.println("preço final para MG : " + impostoMG);
            case 3 -> System.out.println("preço final para RJ : " + impostoRJ);
            case 4 -> System.out.println("preço final para MS : " + impostoMS);
            default -> System.out.println("Erro");
        }


    }
    //solved
}
