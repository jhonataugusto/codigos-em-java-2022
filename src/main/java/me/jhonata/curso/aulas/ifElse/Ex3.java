package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int x = Integer.parseInt(scanner.nextLine());
        if (x > 0) {
            double raiz = Math.sqrt(x);
            System.out.println(raiz);
        } else {
            double potencia = Math.pow(x, 2);
            System.out.println(potencia);
        }
    }
    //solved
}
