package main.me.jhonata.aulas14;

import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos",170));
        cursos.add(new Curso("Algoritmos e logica de programação",170));
        cursos.add(new Curso("Programação em C: Essencial",125));
        cursos.add(new Curso("Programação em Java: Essencial",0));
        cursos.add(new Curso("Programação em Python: Essencial",0));
        cursos.add(new Curso("Banco de Dados: Essencial",0));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                //.findAny() //pega qualquer um de acordo com o filtro
                .findFirst()//pega o primeiro
                .ifPresent(System.out::println); // se encontrar algum curso, imprime
    }
}
