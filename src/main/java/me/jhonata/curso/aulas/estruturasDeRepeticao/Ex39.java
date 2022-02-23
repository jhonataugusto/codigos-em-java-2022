package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        int base = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a altura: ");
        int altura = Integer.parseInt(scanner.nextLine());
        if (base > 0 || altura > 0) {
            int area = base * altura;
            System.out.println("area do retangulo: " + area);

        } else {
            System.out.println("Base ou altura menor que 0.");
        }
    }
    //solved
}
