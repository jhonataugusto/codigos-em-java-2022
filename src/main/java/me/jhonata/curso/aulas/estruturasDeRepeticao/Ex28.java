package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: para a formula: ");
        System.out.println("E = 1 + 1/1! + 1/2! + ... + 1/N!");
        int n = Integer.parseInt(scanner.nextLine());
        float h = 1.0f;
        int fat = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= i; j++) {
                fat *= j;
            }
            System.out.println("fatorial de " + i + ": " + fat);
            h += 1.0f / fat; //calculo
        }
        System.out.println(h);
    }
    //solved
}
