package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        int resposta;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um numero:");
            int n1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite outro numero:");
            int n2 = Integer.parseInt(scanner.nextLine());

            resposta = 0;
            System.out.println("O que quer fazer com esses numeros?");
            System.out.println("[1] - adicionar");
            System.out.println("[2] - subtrair");
            System.out.println("[3] - multiplicar");
            System.out.println("[4] - dividir");
            System.out.println("[5] - sair");
            resposta = Integer.parseInt(scanner.nextLine());
            if (resposta == 1) {
                int adicao = adicao(n1, n2);
                System.out.println("adição: " + adicao);
            } else if (resposta == 2) {
                int subtracao = subtracao(n1, n2);
                System.out.println("subtração: " + subtracao);
            } else if (resposta == 3) {
                int multiplicacao = multiplicacao(n1, n2);
                System.out.println("Multiplicação: " + multiplicacao);
            } else if (resposta == 4) {
                int divisao = divisao(n1, n2);
                System.out.println("divisão: " + divisao);
            }
        } while (resposta != 5);
        System.out.println("saindo do programa...");
    }

    public static int subtracao(int n1, int n2) {
        return n1 - n2;
    }

    public static int adicao(int n1, int n2) {
        return n1 + n2;
    }

    public static int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public static int divisao(int n1, int n2) {
        return n1 / n2;
    }

    //solved
}
