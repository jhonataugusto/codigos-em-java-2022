package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite um numero inteiro: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma += i;
            }
        }
        System.out.println("soma: " + soma);
        //solved
    }
}
