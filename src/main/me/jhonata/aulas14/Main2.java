package main.me.jhonata.aulas14;

import java.util.ArrayList;
import java.util.List;

/**
 * Streams:
 *
 *  > são fluxos de dados/objetos utilizados para que possamos trabalhar com esses dados de forma mais criteriosa.
 *  > Quando trabalhamos com streams, os métodos aplicados a estre stream não afeta a coleção original
 */
public class Main2 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos",170));
        cursos.add(new Curso("Algoritmos e logica de programação",170));
        cursos.add(new Curso("Programação em C: Essencial",125));
        cursos.add(new Curso("Programação em Java: Essencial",0));
        cursos.add(new Curso("Programação em Python: Essencial",0));
        cursos.add(new Curso("Banco de Dados: Essencial",0));

        //como fazer para imprimir somente os cursos com mais de 100 alunos?

        //1 - transformando a coleção de cursos em stream
        cursos.stream()
                //2 - aplicando o filtro de 100 ou mais alunos
                .filter(c -> c.getAlunos() >= 100)
                //3 - imprimimos o resultado
                .forEach(System.out::println);

        // EM 1 LINHA CARA MEU DEUSSSSS


    }
}
