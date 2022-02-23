package main.me.jhonata.aulas14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos",170));
        cursos.add(new Curso("Algoritmos e logica de programação",170));
        cursos.add(new Curso("Programação em C: Essencial",125));
        cursos.add(new Curso("Programação em Java: Essencial",0));
        cursos.add(new Curso("Programação em Python: Essencial",0));
        cursos.add(new Curso("Banco de Dados: Essencial",0));

//        List<Curso> resultado = cursos.stream()
//                .filter(c -> c.getAlunos() >= 100)
//                .toList();
//
//        resultado.forEach(System.out::println);


        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos))
                .forEach((nome, alunos) -> System.out.println(nome+" tem "+alunos));
    }
}
