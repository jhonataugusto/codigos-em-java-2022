package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0 || i % 17 == 0) {
                System.out.println(i);
            }
        }

        //solved?? LMAO
    }
}
