package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero positivo e par: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n % 2 == 0 && n > 0) {
            for (int i = n; i >= 0; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Esse numero nao e positivo e nao e par");
        }

        //solved
    }
}
