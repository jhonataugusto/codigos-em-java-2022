package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("para janeiro    - > [1]");
        System.out.println("para fevereiro  - > [2]");
        System.out.println("para março      - > [3]");
        System.out.println("para abril      - > [4]");
        System.out.println("para maio       - > [5]");
        System.out.println("para junho      - > [6]");
        System.out.println("para julho      - > [7]");
        System.out.println("para agosto     - > [8]");
        System.out.println("para setembro   - > [9]");
        System.out.println("para outubro    - > [10]");
        System.out.println("para novembro   - > [11]");
        System.out.println("para dezembro   - > [12]");

        int n = Integer.parseInt(scanner.nextLine());

        switch (n) {
            case 1:
                System.out.println("janeiro");
                break;
            case 2:
                System.out.println("fevereiro");
                break;
            case 3:
                System.out.println("março");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("maio");
                break;
            case 6:
                System.out.println("junho");
                break;
            case 7:
                System.out.println("julho");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("setembro");
                break;
            case 10:
                System.out.println("outubro");
                break;
            case 11:
                System.out.println("novembro");
                break;
            case 12:
                System.out.println("dezembro");
                break;
            default:
                System.out.println("Numero inválido!");
                break;
        }
    }
}
//solved
