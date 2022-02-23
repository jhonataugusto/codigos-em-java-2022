package main.me.jhonata.aulas13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * classes anônimas
 *
 * Classes anônimas são classes sem nome
 *
 * quando utilizar?
 *
 * geralmente utilizamos classes anonimas quando temos interfaces com um ou poucos métodos e não precisamos reaproveitar
 * o código da classe.
 *
 * se não iremos precisar reaproveitar a classe em um outro lugar do nosso sistema e esta classe que eu deveria criar iria apenas implementar uma interface
 * com um ou poucos métodos, podemos utilizar o conceito de classe anônima.
 *
 */
public class Main4 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        Comparator<String> comparador = new ComparadorPorTamanho();

        //ex 1 de classe anonima
        Consumer<String> consumidor = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        //ordenar por tamanho
        palavras.sort(comparador);

        System.out.println(palavras);

        palavras.forEach(consumidor);


    }
}
