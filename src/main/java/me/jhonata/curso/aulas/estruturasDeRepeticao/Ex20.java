package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int dadosLidos = 0, nPares = 0;

        while (loop) {
            System.out.println("Digite um numero: ");
            int n = Integer.parseInt(scanner.nextLine());
            if (n % 2 == 0) {
                nPares++;
            }
            dadosLidos++;

            if (n == 1000) {
                loop = false;
            }
        }
        System.out.println("numero de dados lidos: " + dadosLidos);
        System.out.println("numeros pares:" + nPares);
    }
    //solved
}
