package main.me.jhonata.aulas13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main5 {
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

        //ex2 (dentro do foreach)
        palavras.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
