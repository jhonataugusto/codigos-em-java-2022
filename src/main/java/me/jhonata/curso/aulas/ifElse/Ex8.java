package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua primeira nota: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite sua segunda nota: ");
        int n2 = Integer.parseInt(scanner.nextLine());

        if ((n >= 0 && n <= 10) && (n2 >= 0 && n2 <= 10)) {
            System.out.println("Todas as notas possuem um valor valido");
            int media = (n + n2) / 2;
            System.out.println("média do aluno: " + media);
        } else {
            System.out.println("Alguma das notas não possuem um valor válido");
        }
    }
    //solved
}
