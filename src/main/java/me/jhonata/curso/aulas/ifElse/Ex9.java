package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salário do trabalhador: ");
        int salarioTrabalhador = Integer.parseInt(scanner.nextLine());

        System.out.println("digite o valor da prestação: ");
        int prestacao = Integer.parseInt(scanner.nextLine());

        if (prestacao >= salarioTrabalhador + (salarioTrabalhador * 0.2)) {
            System.out.println("Empréstimo não concedido");
        } else {
            System.out.println("Empréstimo concedido.");

        }
    }
    //solved
}
