package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero entre 100 a 999: ");
        int n = Integer.parseInt(scanner.nextLine());
        if (n > 100 && n < 999) {

            String number = String.valueOf(n); //converter qualquer valor para string.
            char[] digits = number.toCharArray(); //converter a string para um array de caracteres.

            for (int i = 0; i <= digits.length; i++) {
                System.out.println(digits[i]);
            }
        } else {
            System.out.println("voce nao respondeu corretamente");
        }
        //solved..??
    }
}
