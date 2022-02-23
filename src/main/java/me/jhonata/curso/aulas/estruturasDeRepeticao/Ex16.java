package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu numero aqui: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 == 1) {
            for (int i = n; i >= 0; i--) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("seu numero é par ou negativo.");
        }
        //solved
    }
}
