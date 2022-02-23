package main.me.jhonata.aulas10;

/**
 * para executar métodos em paralelo, nossa classe deve implementar a interface Runnable, e o método que precisar
 * ser executado em paralelo, deve ser executado dentro do método "run()"
 */
public class BarraDeProgresso implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Barra de progresso... aguarde");
        }
    }
}
