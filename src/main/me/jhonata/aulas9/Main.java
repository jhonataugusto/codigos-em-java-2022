package main.me.jhonata.aulas9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * coleções
 *
 * Arrays (vetores/Matrizes) tamanho fixo (se criarmos um array com 5 elementos, ele terá no máximo 5 elementos)
 *
 *  Arrays tem tipos de dados fixos
 *  é dificil encontrar um dado especifico em uma array. precisamos para isso percorer o array através do indice
 *  fazendo verificações
 *
 *  java evoluiu e criou implementações (possui diversas classes e intefaces que facilitam o trabalho quando se trata de coleções de dados)
 *
 *
 * - Listas :
 *  Aceitam repetição de valores
 *  Possuem valor infinito
 *  Podemos adicionar valores de qualquer tipo, desde que não especificamos um tipo na declaração!
 *
 *
 */
public class Main {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("Maria");
        nomes.add("Felicity");
        nomes.add("Angelina");
        nomes.add("Geek");
        nomes.add("Maria");

        //enquanto for possivel adicionar novos nomes, ele vai colocar

        System.out.println(nomes.size());

        Collections.sort(nomes); //ordenar de acordo com as letras, MUITO BOM!

        for(String nome : nomes){
            System.out.println(nome);
        }

    }
}
