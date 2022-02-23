package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas vezes voce quer que os numeros sejam lidos?: ");
        int n = Integer.parseInt(scanner.nextLine());
        int maiorNumero = 0;
        int quantasVezesFoiLido = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("digite um numero: ");
            int z = Integer.parseInt(scanner.nextLine());
            if (z > maiorNumero) {
                quantasVezesFoiLido++;
                maiorNumero = z;
            }
        }
        System.out.println("maior numero: " + maiorNumero);
        System.out.println("quantas vezes foi lido : " + quantasVezesFoiLido);

        //solved
    }
}
