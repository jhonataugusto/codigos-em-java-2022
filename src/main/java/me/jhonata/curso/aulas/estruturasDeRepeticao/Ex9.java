package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        int quantidadeDeVezes;
        int numeroDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("digite a quantidade de vezes que gostaria de repetir: ");
        quantidadeDeVezes = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= quantidadeDeVezes; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        //solved
    }
}
