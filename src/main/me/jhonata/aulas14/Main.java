package main.me.jhonata.aulas14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * revisão:
 *
 * > Classes anonimas
 * > Lambdas
 * > Method References
 *
 */
public class Main {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos",170));
        cursos.add(new Curso("Algoritmos e logica de programação",170));
        cursos.add(new Curso("Programação em C: Essencial",125));
        cursos.add(new Curso("Programação em Java: Essencial",0));
        cursos.add(new Curso("Programação em Python: Essencial",0));
        cursos.add(new Curso("Banco de Dados: Essencial",0));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        cursos.forEach(System.out::println);
    }
}
