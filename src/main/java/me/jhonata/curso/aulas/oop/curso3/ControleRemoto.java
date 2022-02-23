package main.java.me.jhonata.curso.aulas.oop.curso3;

public class ControleRemoto {

    private Televisao televisao;

    public ControleRemoto(Televisao televisao) {
        this.televisao = televisao;
    }


    public Televisao getTelevisao() {
        return televisao;
    }


    public void aumentarVolume(int volume) {
        getTelevisao().setVolume(getTelevisao().getVolume() + volume);
        statusVolume();
    }

    public void diminuirVolume(int volume) {
        getTelevisao().setVolume(getTelevisao().getVolume() - volume);
        statusVolume();
    }

    public void statusVolume() {

        int soma = 0;
        int[] volumes = new int[10];

        for (int i = 0; i < 10; i++) {
            soma += 10;
            volumes[i] = soma;
        }

        for (int i = 0; i < 10; i++) {

            if (getTelevisao().getVolume() >= volumes[i]) {
                System.out.print("|");
            } else {
                System.out.print("-");
            }

        }
        System.out.println("    " + getTelevisao().getVolume() + "%");
    }

    public void trocarCanal(int canal) {
        System.out.println("Você estava no canal : " + getTelevisao().getCanal());
        getTelevisao().setCanal(canal);
        System.out.println("Mudando para o canal : " + canal);
        System.out.println("Agora você está assistindo o canal: " + getTelevisao().getCanal());
    }


}
