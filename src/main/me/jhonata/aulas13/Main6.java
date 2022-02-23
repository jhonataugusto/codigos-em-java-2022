package main.me.jhonata.aulas13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * expressões lambdas, são funcões anônimas
 */
public class Main6 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();


        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        palavras.sort(comparador);

//        //expressão lambda - forma 1
//        palavras.forEach((String s) -> {
//            System.out.println(s);
//        });


        //expressão lambda - forma 2
        palavras.forEach(s -> System.out.println(s));


    }
}
