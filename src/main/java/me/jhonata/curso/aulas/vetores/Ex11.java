package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numerosReais = new double[10];
        int numerosNegativos = 0;
        int somaPositivos = 0;

        for (int i = 0; i < numerosReais.length; i++) {
            System.out.println("Digite o numero " + (i + 1) + ":");
            double n = Double.parseDouble(scanner.nextLine());
            numerosReais[i] = n;
            if (n > 0) {
                somaPositivos += n;
            } else {
                numerosNegativos++;
            }
        }
        System.out.println("numeros negativos: " + numerosNegativos);
        System.out.println("Soma dos postivos: " + somaPositivos);
    } //solved
}
