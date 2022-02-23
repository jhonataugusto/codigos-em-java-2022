package main.me.jhonata.aulas1;

public class Conta {

    int numeroConta;
    float saldo;
    float limite;
    Cliente cliente;

    public Conta(int numeroConta, float saldo, float limite, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
        //você consegue executar coisas dentro do método construtor! é como se fosse um "main" da sua classe..
        //pois a mesma classe vai ter que ser declarada em algum lugar e em algum programa!
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return cliente;
    }


}
