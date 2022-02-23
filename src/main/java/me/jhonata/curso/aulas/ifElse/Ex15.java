package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("para segunda [1]");
        System.out.println("para terça [2]");
        System.out.println("para quarta [3]");
        System.out.println("para quinta [4]");
        System.out.println("para sexta [5]");
        System.out.println("para sabado [6]");
        System.out.println("para domingo [7]");

        int n = Integer.parseInt(scanner.nextLine());


        switch (n) {
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("Numero inválido");
                break;
        }
    }

    //solved
}
