package main.me.jhonata.aulas10;

import main.me.jhonata.aulas6.Conta;

public class FazDeposito implements Runnable{
    private Conta conta;

    public FazDeposito(Conta conta){
        this.conta = conta;
    }


    @Override
    public void run() {
        conta.deposita(100);
    }
}
