package main.me.jhonata.aulas10;

public class GeraRelatorio implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Gerando relatorio... aguarde");
        }
    }
}
