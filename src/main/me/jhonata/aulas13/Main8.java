package main.me.jhonata.aulas13;

import java.util.ArrayList;
import java.util.List;

/**
 * expressões lambdas são funções anônimas, ou seja, são funções anônimas
 *
 * podemos utilizar expressões lambdas com interfaces funcionais
 *
 * devemos criar uma função lambda compatível com a função da interface que estivermos utilizando.
 *
 * ex:
 *
 * - A interface consumer, possui um método que recebe uma string e não retorna nada. Por isso foi possível utilizar a expressão
 * lambda que passa uma string como parâmetro e não retorna nada.
 */
public class Main8 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        palavras.forEach(s -> System.out.println(s));
    }
}
