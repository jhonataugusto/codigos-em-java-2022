package main.java.me.jhonata.curso.aulas.ifElse;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int nota1 = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.println("Digite a segunda nota:");
        int nota2 = Integer.parseInt(scanner.nextLine());

        int mediaPeso1 = ((nota1 + nota2) / 2);

        System.out.println();

        if (mediaPeso1 >= 60) {
            System.out.println("Voce passou!");
            System.out.println("Voce deseja fazer a 3 prova? Y/N");
            String resposta = scanner.nextLine();
            System.out.println();

            switch (resposta) {
                case "Y" -> {
                    System.out.println("Digite a terceira nota");
                    int nota3 = Integer.parseInt(scanner.nextLine());
                    System.out.println();

                    if (nota1 > nota2) {
                        nota2 = nota3;
                    } else if (nota2 > nota1) {
                        nota1 = nota3;
                    }

                    int mediaPeso2 = ((nota1 + nota2) / 2);

                    if (mediaPeso2 >= 60) {
                        System.out.println("sua media: " + mediaPeso2);
                        System.out.println("voce passou, parabéns");
                    } else {
                        System.out.println("você abaixou sua nota!");
                    }
                }
                case "N" -> {
                    System.out.println("sua média: " + mediaPeso1);
                    System.out.println("Tudo bem, Você passou mesmo assim! Terminando o programa.");
                    System.out.println();
                }
                default -> {
                    System.out.println("Resposta Inválida. Terminando o programa.");
                    System.out.println();
                }
            }

        } else {
            System.out.println("sua média: " + mediaPeso1);
            System.out.println("Voce não passou, irá ter que fazer a recuperação...");
            System.out.println();
            System.out.println("Digite a terceira nota");
            int nota3 = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (nota1 > nota2) {
                nota2 = nota3;
            } else if (nota2 > nota1) {
                nota1 = nota3;
            }


            int mediaPeso2 = ((nota1 + nota2) / 2);

            if (mediaPeso2 >= 60) {
                System.out.println("sua media: " + mediaPeso2);
                System.out.println("voce passou, parabéns");
            } else {
                System.out.println("media: " + mediaPeso2);
                System.out.println("você está reprovado!");
            }

        }
    }
    //solved
}
