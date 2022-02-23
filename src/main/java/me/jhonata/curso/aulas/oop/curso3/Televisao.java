package main.java.me.jhonata.curso.aulas.oop.curso3;

@SuppressWarnings("unused")
public class Televisao {
    private boolean ligada;
    private int canal;
    private int volume;

    public Televisao() {
        this.ligada = false;
        this.canal = 0;
        this.volume = 50;
    }

    public int getCanal() {
        return canal;
    }

    /**
     * Mudar o canal de uma televisão
     * @param canal a ser escolhido.
     */
    public void setCanal(int canal) {
        this.canal = canal;
    }

    /**
     * conseguir o volume de uma televisão
     * @return retorna o valor em inteiro do volume da sua televisão
     */
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
