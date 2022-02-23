package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um mês");
        int mes = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite um dia do ano : ");
        int dia = Integer.parseInt(scanner.nextLine());

        if ((mes != 0 && mes <= 12) && (dia != 0 && dia <= 31)) {
            if (mes == 1) {
                System.out.println("sim, existe uma data");
            } else if (mes == 2) {
                if (dia == 29) {
                    System.out.println("ano bissexto");
                } else if (dia == 28) {
                    System.out.println("ano não bissexto");
                }

            } else if (mes == 3) {
                System.out.println("sim, existe uma data");

            } else if (mes == 4) {
                System.out.println("sim, existe uma data");
            } else if (mes == 5) {
                System.out.println("sim, existe uma data");
            } else if (mes == 6) {
                System.out.println("sim, existe uma data");
            } else if (mes == 7) {
                System.out.println("sim, existe uma data");
            } else if (mes == 8) {
                System.out.println("sim, existe uma data");
            } else if (mes == 9) {
                System.out.println("sim, existe uma data");
            } else if (mes == 10) {
                System.out.println("sim, existe uma data");
            } else if (mes == 11) {
                System.out.println("sim, existe uma data");
            } else if (mes == 12) {
                System.out.println("sim, existe uma data");
            }
        } else {
            System.out.println("Este mês ou dia não existe!");
        }

        //solved
    }
}
