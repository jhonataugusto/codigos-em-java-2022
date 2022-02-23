package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        int ano = Integer.parseInt(scanner.nextLine());
        if ((ano % 400 == 0 || ano % 4 == 0) && (!(ano % 100 == 0))) {
            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    } //solved
}
