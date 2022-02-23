package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int menorValor = 9999;
        int maiorValor = 0;

        Scanner scanner = new Scanner(System.in);
        int valorDigitado;
        for (int i = 0; i <= 9; i++) {
            System.out.println("digite um numero: ");
            valorDigitado = Integer.parseInt(scanner.nextLine());
            if (valorDigitado < menorValor) {
                menorValor = valorDigitado;
            } else if (valorDigitado > maiorValor) {
                maiorValor = valorDigitado;
            }
        }
        System.out.println("maior valor: " + maiorValor);
        System.out.println("menor valor: " + menorValor);
    }
    //solved
}
