package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

public class Ex10 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                soma = soma + i;
            }
        }
        System.out.println("soma dos numeros pares: " + soma);
    }
    //solved
}
