package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println("esse numero é divisivel por 3 ou por 5");
        }
    }
    //solved
}
