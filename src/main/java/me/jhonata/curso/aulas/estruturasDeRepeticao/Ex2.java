package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("for: ");
        for (int i = 0; i <= 100; i++) {

            System.out.println(i);
        }
        int i = 0;
        System.out.println("while: ");
        while (i <= 100) {

            System.out.println(i);
            i++;
        }
        System.out.println("do-while: ");
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
    }
    //solved
}
