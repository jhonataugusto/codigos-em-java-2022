package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int media, idade;
        int repeticoes = 0;
        do {
            System.out.println("Digite uma idade qualquer");
            idade = Integer.parseInt(scanner.nextLine());
            if (idade > 0) {
                soma += idade;
                repeticoes++;
            } else {
                media = soma / repeticoes;
                System.out.println("MEDIA : " + media);
                System.out.println("fim do programa.");
            }

        } while (idade > 0);
    }
    //solved
}
