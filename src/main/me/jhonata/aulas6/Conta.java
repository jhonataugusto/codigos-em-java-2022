package main.me.jhonata.aulas6;

public class Conta {
    private static int contador = 1;
    private int numero;
    private String cliente;
    private double saldo;

    public Conta(String cliente) {
        this.numero = contador;
        this.cliente = cliente;
        Conta.contador = Conta.contador + 1;
        this.saldo = 0.0f;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Conta.contador = contador;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getCliente() {
        return this.cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public synchronized void deposita(double saldo){
        setSaldo(getSaldo() + saldo);
    }


    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
