package main.me.jhonata.aulas11;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> lista = new java.util.LinkedList<String>();

        lista.add("Felicity");
        lista.add("Angelina");
        lista.add(0,"Maria");
        System.out.println(lista);
    }
}
