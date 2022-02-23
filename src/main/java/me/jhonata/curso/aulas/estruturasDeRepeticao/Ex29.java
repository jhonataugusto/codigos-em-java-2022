package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

public class Ex29 {
    public static void main(String[] args) {


        float s = 0.0f;
        int fat = 1;

        //descobrir fatorial de (numeros pares)

        for (int i = 1; i <= 5; i++) {

            if (i % 2 == 0) {
                fat = 1;
                for (int j = 1; j <= i; j++) {
                    fat *= j;
                }
                //sequencia do numero harmonico
                s += (float) i / fat;
            }
        }
        System.out.println("fatorial = " + fat);
        System.out.println("S = " + s);
    }

    //solved
}
