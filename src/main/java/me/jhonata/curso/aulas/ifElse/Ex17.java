package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a base maior: ");
        int baseMaior = Integer.parseInt(scanner.nextLine());

        System.out.println("digite a base menor: ");
        int baseMenor = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a altura: ");
        int altura = Integer.parseInt(scanner.nextLine());

        if (!(baseMaior == 0 || baseMenor == 0 || altura == 0)) {
            double areaTrapezio = (double) (((baseMaior + baseMenor) * altura) / 2);

            System.out.println("area do trapézio: " + areaTrapezio);
        } else {
            System.out.println("Os valores não podem ser 0!");
        }
        //solved
    }
}
