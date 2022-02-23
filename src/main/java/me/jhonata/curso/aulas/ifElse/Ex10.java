package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double altura = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite seu sexo [M/F para responder]");
        String sexo = scanner.nextLine();

        if (sexo.equals("M")) {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal: " + pesoIdeal);
        } else if (sexo.equals("F")) {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso ideal: " + pesoIdeal);
        } else {
            System.out.println("Resposta incorreta.");
        }
        //solved
    }
}
