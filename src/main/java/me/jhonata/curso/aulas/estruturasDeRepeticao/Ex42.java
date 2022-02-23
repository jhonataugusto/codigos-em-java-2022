package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("Digite um numero: ");
            n = Integer.parseInt(scanner.nextLine());
            if (n > 0) {
                int squareN = (int) Math.pow(n, 2);
                int cubeN = (int) Math.pow(n, 3);
                int raizN = (int) Math.sqrt(n);

                System.out.println("quadrado de " + n + ": " + squareN);
                System.out.println("cubo de : " + n + ": " + cubeN);
                System.out.println("raiz de : " + n + ": " + raizN);
            }
        } while (n > 0);
        System.out.println("fim do programa.");
    }
    //solved
}
