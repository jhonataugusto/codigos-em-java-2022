package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero entre 1000 e 9999: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n > 1000 && n < 9999) {
            int primeiro = (n % 10000) / 1000;
            int segundo = (n % 1000) / 100;
            int terceiro = (n % 100) / 10;
            int quarto = n % 10;

            String primeiroSegundo = "" + primeiro + segundo;
            String terceiroQuarto = "" + terceiro + quarto;

            int intPrimeiroSegundo = Integer.parseInt(primeiroSegundo);
            int intTerceiroQuarto = Integer.parseInt(terceiroQuarto);

            int somaDosDois = intPrimeiroSegundo + intTerceiroQuarto;
            int quadradoDosDois = (int) Math.pow(somaDosDois, 2);


            System.out.println(primeiro + " " + segundo + " " + terceiro + " " + quarto);
            System.out.println("quadrado dos dois numeros superiores e inferiores: " + quadradoDosDois);
        }

    }
}
