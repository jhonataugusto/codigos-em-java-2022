package main.me.jhonata.aulas9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main6 {

    /**
     *
     *  Os mapas são representados em Java pela interface Map
     *  e mapeia seus elementos utilziando o conceito de chave/valor
     *
     *  mapas são conhecidos por representarem 3 coleções
     *      Coleção de chaves
     *      Coleção de valores
     *      Coleção de associações
     */
    public static void main(String[] args) {

        //=====================================================================
        Map<Integer,String> pessoas = new HashMap<Integer,String>();

        pessoas.put(21,"Jhonata");
        pessoas.put(19,"Josiely");
        pessoas.put(45,"Angelina");

        //coleção de chaves
        System.out.println(pessoas.keySet());

        //coleção de valores
        System.out.println(pessoas.values());

        //coleção de associações
        System.out.println(pessoas.entrySet());

        //=====================================================================



        //Iterar na coleção de chaves


        //forma 1
        Set<Integer> chaves = pessoas.keySet();

        for(Integer idade : chaves){
            System.out.println(idade);
        }


        //forma 2
        pessoas.keySet().forEach(idade ->{
            System.out.println(pessoas.get(idade));
        });




        //=====================================================================



        //Iterar na coleção de valores

        //forma 1
        Collection<String> valores = pessoas.values();

        for (String nome : valores){
            System.out.println(nome);
        }

        //forma 2
        pessoas.values().forEach(nome ->{
            System.out.println(nome);
        });


        //forma 3 (+ simplificada)
        pessoas.values().forEach(System.out::println);



        //=====================================================================


        //Iterar a coleção de associações

        //forma 1
        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();

        for (Map.Entry<Integer, String> associacao : associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }


        //forma 2
        pessoas.entrySet().forEach(associacao -> {
            System.out.println(associacao.getKey() + " - " +  associacao.getValue());
        });


        //forma 3 (+ simplificada)
        pessoas.forEach((key, value) -> System.out.println(key + " - " + value));


    }
}
