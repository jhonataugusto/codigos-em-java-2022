package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorResistencia;

        do {

            System.out.println("Digite o valor de R1: ");
            int r1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Digite o valor de R2: ");
            int r2 = Integer.parseInt(scanner.nextLine());

            if (!(r1 == 0 || r2 == 0)) {
                valorResistencia = ((r1 * r2) / r1 + r2);
                System.out.println("valor da resistencia: " + valorResistencia);
            } else {
                valorResistencia = 0;
            }

        } while (valorResistencia != 0);
        System.out.println("fim do programa.");
    }
}
