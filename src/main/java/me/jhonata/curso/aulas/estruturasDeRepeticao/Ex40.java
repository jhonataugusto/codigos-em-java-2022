package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 1;
        do {
            System.out.println("digite um numero: ");
            numero = Integer.parseInt(scanner.nextLine());

            System.out.println("numero digitado: " + numero);
        } while (numero >= 0);
        System.out.println("fim de programa.");
    }
    //solved
}
