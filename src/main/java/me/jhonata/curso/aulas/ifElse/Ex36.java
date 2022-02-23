package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        double comissao = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da venda mensal: ");
        double valorVenda = Double.parseDouble(scanner.nextLine());


        if (valorVenda >= 100.000) {
            comissao = 700 + (valorVenda * 0.16);
            System.out.println("sua comissão: " + comissao + "R$");
        } else if (valorVenda < 100.000 && valorVenda >= 80.000) {
            comissao = 650 + (valorVenda * 0.14);
            System.out.println("sua comissão: " + comissao + "R$");
        } else if (valorVenda < 80.000 && valorVenda >= 60.000) {
            comissao = 600 + (valorVenda * 0.14);
            System.out.println("sua comissão: " + comissao + "R$");
        } else if (valorVenda < 60.000 && valorVenda >= 40.000) {
            comissao = 550 + (valorVenda * 0.14);
            System.out.println("sua comissão: " + comissao + "R$");
        } else if (valorVenda < 40.000 && valorVenda >= 20.000) {
            comissao = 500 + (valorVenda * 0.14);
            System.out.println("sua comissão: " + comissao + "R$");
        } else if (valorVenda < 20.000) {
            comissao = 400 + (valorVenda * 0.14);
            System.out.println("sua comissão: " + comissao + "R$");
        }
    }
    //solved
}
