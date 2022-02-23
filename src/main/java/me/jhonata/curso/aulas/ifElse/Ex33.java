package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço atual do produto: ");
        double precoAtual = Integer.parseInt(scanner.nextLine());

        if (precoAtual <= 50) {
            double precoAlterado = precoAtual + (precoAtual * 0.05);
            System.out.println("aumentado 5% do valor ! : " + precoAlterado);
        } else if (precoAtual <= 100) {
            double precoAlterado = precoAtual + (precoAtual * 0.1);
            System.out.println("aumentado 10% do valor ! : " + precoAlterado);
        } else {
            double precoAlterado = precoAtual + (precoAtual * 0.15);
            System.out.println("aumentado 15% do valor ! : " + precoAlterado);
        }
    } //solved
}
