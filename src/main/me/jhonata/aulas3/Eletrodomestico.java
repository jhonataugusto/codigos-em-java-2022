package main.me.jhonata.aulas3;

public class Eletrodomestico {
    private boolean ligado;

    public Eletrodomestico() {
        this.ligado = false;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }


    @Override
    public String toString() {
        return "ligado ? > " + isLigado() + "\n";
    }
}
