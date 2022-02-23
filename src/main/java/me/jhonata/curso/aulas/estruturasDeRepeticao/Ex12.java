package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero qualquer: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    //solved
}
