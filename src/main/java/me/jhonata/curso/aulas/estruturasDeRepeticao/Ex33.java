package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantas vezes voce quer ver os numeros naturais de n1 e n2: ");
        int n1, n2, n;
        n = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o n1: ");
        n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o n2: ");
        n2 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            if (i % n1 == 0 || i % n2 == 0) {
                System.out.println(i);
            }
        }
    }
    //solved
}
