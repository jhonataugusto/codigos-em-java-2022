package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para repetir: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }
    //solved
}
