package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distancia em KM:");
        int km = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a quantidade de litros em gasolina: ");
        int litrosConsumidos = Integer.parseInt(scanner.nextLine());

        int kmPorL = km / litrosConsumidos;

        if (kmPorL < 8) {
            System.out.println("Venda o carro!");
        }
        if (kmPorL >= 8 && kmPorL <= 14) {
            System.out.println("Economico!");
        }
        if (kmPorL > 12) {
            System.out.println("Super economico!");
        }
    } //solved
}
