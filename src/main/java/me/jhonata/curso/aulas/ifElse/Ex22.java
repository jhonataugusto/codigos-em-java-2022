package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        int idade, tempoServico;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        idade = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite seu tempo de trabalho: ");
        tempoServico = Integer.parseInt(scanner.nextLine());

        if ((idade >= 65 || tempoServico >= 30) || (idade >= 60 && tempoServico >= 25)) {
            System.out.println("Voce pode se aposentar");
        } else {
            System.out.println("Voce nao pode se aposentar.");
        }
    } // solved
}
