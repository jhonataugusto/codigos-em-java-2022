package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite outro numero: ");
        int n2 = Integer.parseInt(scanner.nextLine());

        int soma = 0;
        int multiplicacao = 1;

        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                soma += i;
            } else if (i % 2 == 1) {
                multiplicacao *= i;
            }
        }
        System.out.println("soma dos pares: " + soma);
        System.out.println("multiplicacao dos impares: " + multiplicacao);
    }
    //solved
}
