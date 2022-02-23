package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor inicial: ");
        int vi = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o valor final: ");
        int vf = Integer.parseInt(scanner.nextLine());

        int soma = 0;

        if (vi < vf) {
            for (int i = vi; i <= vf; i++) {
                if (i % 2 == 1) {
                    soma += i;
                }
            }
            System.out.println("Soma dos ímpares neste intervalo: " + soma);
        } else {
            System.out.println("O numero inicial nao deve ser maior do que o valor final.");
        }
    }
    //solved
}
