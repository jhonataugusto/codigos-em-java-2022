package main.me.jhonata.aulas10;


import main.me.jhonata.aulas6.Conta;

/**
 * por padrão as threads não são sincronizadas. Pode ocorrer problemas de uma thread acessar o valor de um ob
 */

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        Conta conta = new Conta("Jhonata");
        FazDeposito deposito = new FazDeposito(conta);

        Thread t1 = new Thread(deposito);
        Thread t2 = new Thread(deposito);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(conta.toString());
    }
}
