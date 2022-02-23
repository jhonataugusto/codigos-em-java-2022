package main.me.jhonata.aulas7;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("informe o n1: ");
            int n1 = Integer.parseInt(scanner.nextLine());

            System.out.println("informe o n2: ");
            int n2 = Integer.parseInt(scanner.nextLine());

            System.out.println(divisao(n1, n2));
        } catch (NumberFormatException exception) {
            System.out.println("Você não pode digitar numeros!");
        } catch (ArithmeticException exception) { // pode colocar mais de catchs!
            System.out.println("não foi possivel dividir estes numeros!");
        } catch (Exception exception) { // ESSA EXCEÇÃO É A PRINCIPAL, QUE DEVE SER COLOCADA CASO SEU
            //M
            System.out.println("não foi possivel executar a divisão");
        }


        scanner.close();
    }

    /*
     * Criando uma função que avisa que tem possibilidade de lançar uma exceção do tipo
     * Exception!
     * */
    public static int divisao(int n1, int n2) throws Exception {
        return n1 / n2;
    }
}
