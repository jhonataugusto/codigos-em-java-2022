package main.me.jhonata.aulas7;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero para divisão");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Informe o segundo numero para divisão");

        int num2 = Integer.parseInt(scanner.nextLine());

        try {
            int div = num1 / num2;
            System.out.println("A divisão de " + num1 + " por " + num2 + " é: " + div);
        } catch (ArithmeticException exception) {
            System.out.println("Não é possivel dividir " + num1 + " por " + num2 + "!");
        } finally { //o finally é sempre executado, independente se entramos no catch ou não!
            System.out.println("continua o processo!");

        }

        scanner.close();


    }
}
