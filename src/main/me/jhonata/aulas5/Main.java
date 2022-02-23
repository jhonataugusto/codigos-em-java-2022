package main.me.jhonata.aulas5;

//Interfaces são conhecidas como "Contratos"

public class Main {
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();
        vent.ligar();
        vent.desligar();
        System.out.println(vent.MARCA);


    }
}
