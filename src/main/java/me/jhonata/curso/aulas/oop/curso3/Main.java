package main.java.me.jhonata.curso.aulas.oop.curso3;


public class Main {
    public static void main(String[] args) {
        Televisao televisao = new Televisao();
        ControleRemoto controle = new ControleRemoto(televisao);

        controle.statusVolume();
        controle.aumentarVolume(10);
        controle.diminuirVolume(30);
        controle.trocarCanal(6);
        controle.trocarCanal(89);

        televisao.setCanal(5);
        televisao.getVolume();

    }
    //solved
}
