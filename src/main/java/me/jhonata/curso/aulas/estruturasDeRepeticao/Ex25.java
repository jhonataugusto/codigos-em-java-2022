package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

public class Ex25 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i;
                System.out.println(i);
            }
        }
        System.out.println("Soma: " + soma);
    }
    //solved
}
