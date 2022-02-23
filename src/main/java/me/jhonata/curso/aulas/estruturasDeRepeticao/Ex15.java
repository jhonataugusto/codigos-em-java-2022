package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero impar e positivo: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 == 1) {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 1) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("seu numero é negativo ou par");
        }
        //solved
    }
}
