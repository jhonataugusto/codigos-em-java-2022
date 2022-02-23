package main.me.jhonata.aulas13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

//method references

/**
 * podem ser consideradas simplificações das expressões lambdas.
 *
 * é aquele negocio que você tinha visto (::)
 *
 */

public class Main9 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        palavras.forEach(System.out::println);


    }
}
