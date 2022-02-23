package main.me.jhonata.aulas3;

public class Microondas {
    private boolean ligado;
    private boolean portaFechada;

    public Microondas() {
        this.ligado = false;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isPortaFechada() {
        return this.portaFechada;
    }

    private void setPortaFechada(boolean portaFechada) {
        this.portaFechada = portaFechada;
    }

    public void fecharPorta() {
        setPortaFechada(true);
    }

    public void abrirPorta() {
        setPortaFechada(false);
    }

    public void ligar() {
        if (isPortaFechada()) {
            setLigado(true);
        } else {
            System.out.println("A porta tem que estar fechada!");
        }
    }

    public void desligar() {
        setLigado(false);
    }


    @Override
    public String toString() {
        return "Microondas{" +
                "ligado=" + isLigado() +
                '}';
    }
}
