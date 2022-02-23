package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

public class Ex34 {
    public static void main(String[] args) {


        int i, divisores, valor = 8;

        do {
            divisores = 0;
            valor += 2;
            for (i = 1; i <= 20; i++) {
                if (valor % i == 0)
                    divisores++;
            }
        } while (divisores != 20);

        System.out.println("Valor:" + valor);
    }
    //solved '-'
}
