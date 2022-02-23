package main.me.jhonata.aulas12;

import java.util.LinkedList;
import java.util.Queue;

public class ProgramaA {
    public static void main(String[] args) {
        //fila implementação do java

        Queue<String> fila = new LinkedList<String>();
        fila.add("Angelina");
        fila.add("Testando");
        fila.add("Jhonata");

        System.out.println(fila);
        fila.poll();
        System.out.println(fila);
    }
}
