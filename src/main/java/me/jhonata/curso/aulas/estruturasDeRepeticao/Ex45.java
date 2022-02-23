package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //M = K/3,6
        //K = M*3,6


        System.out.println("Digite qual conversor quer usar: ");
        System.out.println("[1] - Conversor km/h para m/s");
        System.out.println("[2] - Conversor m/s para km/h");
        int n = Integer.parseInt(scanner.nextLine());


        if (n == 1) {
            System.out.println("Digite o numero em km/h: ");
            int x = Integer.parseInt(scanner.nextLine());
            double ms = x * 3.6;
            System.out.println("m/s: " + ms);
        } else if (n == 2) {
            System.out.println("Digite o numero em m/s: ");
            int z = Integer.parseInt(scanner.nextLine());
            double km = z / 3.6;
            System.out.println("km/h: " + km);
        } else {
            System.out.println("Comando invalido, fechando o programa.");
        }
        //solved
    }
}
