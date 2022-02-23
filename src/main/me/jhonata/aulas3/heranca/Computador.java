package main.me.jhonata.aulas3.heranca;

public class Computador extends Equipamento {
    private int memoria;
    private String gpu;

    public Computador(String marca, String modelo, int memoria, String gpu) {
        super(marca, modelo);
        this.memoria = memoria;
        this.gpu = gpu;
    }

    private int getMemoria() {
        return this.memoria;
    }

    private void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    private String getGpu() {
        return this.gpu;
    }

    private void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return super.toString() + "memoria > " + getMemoria() + "\n" +
                "gpu > " + getGpu() + "\n";
    }

}
