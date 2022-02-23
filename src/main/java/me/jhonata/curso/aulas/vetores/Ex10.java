package main.java.me.jhonata.curso.aulas.vetores;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notaAlunos = new int[15];
        int soma = 0;
        int media;

        for (int i = 0; i < notaAlunos.length; i++) {
            System.out.println("Digite a nota do aluno " + (i + 1));
            int n = Integer.parseInt(scanner.nextLine());
            notaAlunos[i] = n;
        }

        for (int nota : notaAlunos) {
            soma += nota;
        }

        media = soma / notaAlunos.length;
        System.out.println("Media total das notas dos alunos: " + media);
    } // solved
}
