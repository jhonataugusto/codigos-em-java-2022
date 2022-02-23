package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero H(n): ");
        int n = Integer.parseInt(scanner.nextLine());
        float h = 1.0F;
        for (int i = 2; i <= n; i++) {
            h += 1.0f / i;
        }
        System.out.println(h);
    }
    //solved
}
