package main.me.jhonata.aulas12;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Conjunto {

    private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();

    public Conjunto(){
        for (int i = 97; i < 123; i++) {
            tabela.add(new LinkedList<String>());
        }
    }

    private int calculaIndice(String nome) {
        return nome.toLowerCase().charAt(0) % 26;
    }

}
