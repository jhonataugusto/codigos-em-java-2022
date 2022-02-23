package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o Salário do Carlos: ");
        double salario_carlos = Integer.parseInt(scanner.nextLine());
        double salario_joao = salario_carlos * 0.3333;
        int meses = 0;

        while (salario_joao <= salario_carlos) {
            salario_carlos = salario_carlos + (salario_carlos * 0.2);
            salario_joao = salario_joao + (salario_joao * 0.5);
            meses++;
            System.out.println("mes " + meses + ":      Joao: 5%" + salario_joao + "           Carlos: 2% " + salario_carlos);
        }


        //solved
    }
}
