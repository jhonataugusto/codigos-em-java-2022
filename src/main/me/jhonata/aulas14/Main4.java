package main.me.jhonata.aulas14;

import java.util.ArrayList;
import java.util.List;
//Streams
public class Main4 {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos",170));
        cursos.add(new Curso("Algoritmos e logica de programação",170));
        cursos.add(new Curso("Programação em C: Essencial",125));
        cursos.add(new Curso("Programação em Java: Essencial",0));
        cursos.add(new Curso("Programação em Python: Essencial",0));
        cursos.add(new Curso("Banco de Dados: Essencial",0));

        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)//permite que possamos efetuar cálculos com o resultado.
                .sum();

        System.out.println("A soma de todos os cursos com mais de 100 alunos é "+ soma);


    }
}
