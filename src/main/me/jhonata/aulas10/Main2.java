package main.me.jhonata.aulas10;

/**
 * simulação de geração de relatório + barra de tarefa
 * com a utilização de threads!
 */
public class Main2 {
    public static void main(String[] args) {
        BarraDeProgresso barra = new BarraDeProgresso();

        Thread t1 = new Thread(barra);
        t1.start();

        GeraRelatorio relatorio = new GeraRelatorio();

        Thread t2 = new Thread(relatorio);
        t2.start();



    }
}
