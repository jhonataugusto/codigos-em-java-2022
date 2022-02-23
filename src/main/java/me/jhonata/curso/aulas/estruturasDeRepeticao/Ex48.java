package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

public class Ex48 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int aux;
        int soma = 0;


        for (int i = 0; i <= 50; i++) {
            aux = n1;
            n1 += n2;
            n2 = aux;
            if (n1 % 2 == 0) {
                soma += n1;
            }
        }
        if (soma > 4000000) {
            System.out.println("os valores da soma ultrapassaram 4.000.000 de numeros");
        } else {
            System.out.println("soma:" + soma);
        }
    }

    //solved
}
