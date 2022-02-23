package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        int vezes = 0, soma = 0, media;

        while (loop) {
            System.out.print("Digite um numero: ");
            int n = Integer.parseInt(scanner.nextLine());
            if (n > 10 && n < 20) {
                vezes++;
                soma += n;
                media = soma / vezes;
                System.out.println("media no momento : " + media);
            } else {
                System.out.println("terminando o loop!");
                loop = false;
            }
        }
        //solved
    }
}
