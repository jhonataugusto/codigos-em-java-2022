package main.me.jhonata.aulas13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Default Methods -> são metodos concretos implementados em interfaces. Estes métodos, como são concretos, ou seja,
 * já possuem implementação, não precisam ser implementados nas classes que implementarem esta interface.
 *
 *
 * novidade implementada a partir da versão 8 do java
 * atualmente, estamos na versão 10 do java.
 *
 */
public class Main {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        //comparador personalizado
        Comparator<String> comparador = new ComparadorPorTamanho();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");


        //Collections.sort(palavras,comparador);

        palavras.sort(comparador);

        System.out.println(palavras);
    }
}
