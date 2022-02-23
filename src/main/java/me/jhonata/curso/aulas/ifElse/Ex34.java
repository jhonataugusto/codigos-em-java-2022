package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        double nota;
        int faltasAluno;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota : ");
        nota = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite suas faltas: ");
        faltasAluno = Integer.parseInt(scanner.nextLine());

        if (nota >= 9 && nota <= 10) {
            if (faltasAluno <= 20) {
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        } else if (nota >= 7.5 && nota <= 8.9) {
            if (faltasAluno <= 20) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else if (nota >= 5.0 && nota <= 7.4) {
            if (faltasAluno <= 20) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }
        } else if (nota >= 4.0 && nota <= 4.9) {
            if (faltasAluno <= 20) {
                System.out.println("D");
            } else {
                System.out.println("E");
            }
        } else if (nota >= 0.0 && nota <= 3.9) {
            if (faltasAluno <= 20) {
                System.out.println("E");
            } else {
                System.out.println("E");
            }
        }
    }
    //solved
}
