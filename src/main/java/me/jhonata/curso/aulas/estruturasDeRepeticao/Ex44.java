package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {

        System.out.println("Digite um numero: ");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int a = 1;
        int b = 0;
        int aux;

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            aux = a;
            a += b;
            b = aux;
            if (a >= n) {
                aux = a;
                a += b;
                b = aux;
                System.out.println("testando:" + a);
                break;
            }
            //solved
        }
    }
}
