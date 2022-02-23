package main.me.jhonata.aulas3;

public class Televisor {
    private boolean ligado;
    private int canal;
    private int volume;
    private int volumeMaximo;
    private int numeroCanais;
    private int numeroMutado;

    private int[] volumes;

    public Televisor() {
        this.ligado = false;
        this.canal = 0;
        this.volume = 50;
        this.volumeMaximo = 100;
        this.numeroCanais = 100;

        dadosParaVolume();
    }

    private void dadosParaVolume() {
        this.volumes = new int[10];
        int soma = 0;
        for (int i = 0; i < volumes.length; i++) {
            soma += 10;
            volumes[i] = soma;
        }
    }

    private int getNumeroMutado() {
        return this.numeroMutado;
    }

    private int getNumeroCanais() {
        return this.numeroCanais;
    }

    private int getVolumeMaximo() {
        return this.volumeMaximo;
    }

    private int[] getVolumes() {
        return this.volumes;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getCanal() {
        return this.canal;
    }

    private void setCanal(int canal) {
        this.canal = canal;
    }

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    private void statusVolume() {
        for (int i = 0; i < 10; i++) {
            if (getVolumes()[i] <= getVolume()) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }
        }
        System.out.print(" " + getVolume() + "%\n");
    }

    public void aumentarVolume(int volume) {
        if (isLigado()) {
            if (volume > 0 && volume + getVolume() <= getVolumeMaximo()) {
                setVolume(getVolume() + volume);
                statusVolume();
            } else {
                System.out.println("erro.");
            }
        } else {
            System.out.println("Voce precisa ligar a televisao");
        }

    }

    public void diminuirVolume(int volume) {
        if (isLigado()) {
            if (volume > 0 && volume <= 100) {
                setVolume(getVolume() - volume);
                statusVolume();
            } else {
                System.out.println("numero invalido.");
            }
        } else {
            System.out.println("Voce precisa ligar a televisao");
        }

    }

    public void mudarCanal(int canal) {
        if (isLigado()) {
            if (canal <= getNumeroCanais()) {
                System.out.println("mudando do canal " + getCanal() + "para canal : " + canal);
                setCanal(canal);
                System.out.println("Voce esta no canal" + getCanal());
            } else {
                System.out.println("Canal não existente.");
            }

        } else {
            System.out.println("Voce precisa ligar a televisao");
        }

    }

    public void canalAcima() {
        if (getCanal() < getNumeroCanais()) {
            setCanal(getCanal() + 1);
        } else {
            System.out.println("Você não pode mudar mais do que isso.");
        }
    }

    public void canalAbaixo() {
        if (getCanal() > 0) {
            setCanal(getCanal() - 1);
        } else {
            System.out.println("Você não pode escolher canais abaixo de zero!");
        }
    }


    public void volumeAcima() {
        if (getVolume() < getVolumeMaximo()) {
            setVolume(getVolume() + 1);
            statusVolume();
        }
    }

    public void volumeAbaixo() {
        if (getVolume() > 0) {
            setVolume(getVolume() - 1);
            statusVolume();
        }
    }

    public void mutar() {
        if (getVolume() > 0) {
            this.numeroMutado = getVolume();
            setVolume(0);
        }
    }

    public void desmutar() {
        if (getVolume() == 0 && getNumeroMutado() != 0) {
            setVolume(getNumeroMutado());
        }
    }


    @Override
    public String toString() {
        return "\nligado ? > " + isLigado() + "\n" +
                "canal > " + getCanal() + "\n" +
                "volume > " + getVolume() + "\n";
    }
}
