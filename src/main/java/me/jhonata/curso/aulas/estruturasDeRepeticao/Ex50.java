package main.java.me.jhonata.curso.aulas.estruturasDeRepeticao;

public class Ex50 {
    public static void main(String[] args) {
        double alturaChico = 1.50; // +0.02 cm por ano
        double alturaZe = 1.10; // +0.03 cm por ano
        int anos = 0;
        while (alturaChico >= alturaZe) {
            alturaChico += 0.02;
            alturaZe += 0.03;
            anos++;

            System.out.println("ano " + anos + ":       Ze: " + alturaZe + "              Chico: " + alturaChico);
        }

    }
}
