package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        int soma = 0;
        int quadradoSoma = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            soma += Math.pow(i, 2);
        }

        for (int i = 0; i <= n; i++) {
            quadradoSoma += i;
        }

        int resultadoQuadradoSoma = (int) Math.pow(quadradoSoma, 2);
        System.out.println("Soma dos quadrados: " + soma);
        System.out.println("Soma do quadrado do resultado dos quadrados: " + resultadoQuadradoSoma);
        int diferenca = resultadoQuadradoSoma - soma;
        System.out.println("Diferença entre os dois: " + diferenca);

    }
    //solved
}
