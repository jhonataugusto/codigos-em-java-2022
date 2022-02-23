package main.me.jhonata.aulas3;

public class Moto {

    private String marca;
    private String modelo;
    private String cor;
    private int marcha, maiorMarcha;
    private boolean estaLigada;


    public Moto(String marca, String modelo, String cor, int maiorMarcha) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.marcha = 0;// 0 = marcha neutra
        this.maiorMarcha = maiorMarcha;
        this.estaLigada = false;
    }

    private String getMarca() {
        return this.marca;
    }

    private String getModelo() {
        return this.modelo;
    }

    private String getCor() {
        return this.cor;
    }

    private int getMarcha() {
        return this.marcha;
    }

    private void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    private int getMaiorMarcha() {
        return this.maiorMarcha;
    }

    private boolean getEstaLigada() {
        return this.estaLigada;
    }

    private void setEstaLigada(boolean ligar) {
        this.estaLigada = ligar;
    }

    public void ligarMoto() {
        setEstaLigada(true);
    }

    public void desligarMoto() {
        setEstaLigada(false);
        setMarcha(0);
    }


    public void marchaAcima() {
        if (getEstaLigada()) {
            if (getMarcha() < getMaiorMarcha()) {
                setMarcha(getMarcha() + 1);
            } else {
                System.out.println("Você não pode passar mais marchas!");
            }
        } else {
            System.out.println("Voce precisa ligar a moto primeiro.");
        }

    }

    public void marchaAbaixo() {
        if (getEstaLigada()) {
            if (getMarcha() > 0) {
                setMarcha(getMarcha() - 1);
            } else {
                System.out.println("A marcha já está neutra!");
            }
        } else {
            System.out.println("Voce precisa ligar a moto primeiro.");
        }
    }

    public String marchaAtual() {
        return "marcha atual > " + getMarcha();
    }

    public void LigarMoto() {

    }

    @Override
    public String toString() {
        return "marca > " + getMarca() + "\n" +
                "modelo > " + getModelo() + "\n" +
                "cor > " + getCor() + "\n" +
                "esta ligada? > " + getEstaLigada() + "\n";
    }
}
