package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura;
        int peso;

        System.out.println("Digite sua altura: ");
        altura = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite seu peso: ");
        peso = Integer.parseInt(scanner.nextLine());

        if (altura < 1.20 && peso <= 60) {
            System.out.println("A");
        } else if (altura < 1.20 && (peso >= 60 && peso <= 90)) {
            System.out.println("D");
        } else if (altura < 1.20 && peso > 90) {
            System.out.println("G");
        } else if ((altura >= 1.20 && altura <= 1.70) && peso <= 60) {
            System.out.println("B");
        } else if ((altura >= 1.20 && altura <= 1.70) && (peso >= 60 && peso <= 90)) {
            System.out.println("E");
        } else if ((altura >= 1.20 && altura <= 1.70) && peso > 90) {
            System.out.println("H");
        } else if (altura > 1.70 && peso <= 60) {
            System.out.println("C");
        } else if (altura > 1.70 && (peso >= 60 && peso <= 90)) {
            System.out.println("F");
        } else if (peso > 90 && altura > 1.70) {
            System.out.println("I");
        }
        //solved
    }
}
