package main.me.jhonata.aulas9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
    /**
     * cojuntos
     *
     * Os conjuntos são implementados com a interface set, e uma das classes que implementam esta interface é a HashSet
     *
     *
     * A maioria das coleções possuem os mesmos métodos já conhecidos e utilizados com as listas, mas o comportamento
     * desses objetos é um pouco diferente.
     *
     * A performance também é melhor em conjuntos do que em listas.
     *
     * CONJUNTOS >>>>>>> LISTAS
     *
     * Conjuntos:
     *  não aceitam valores repetidos
     *  a ordem de inserção não é respeitada...
     *  não aceita ordenação
     *  não possui indice
     *
     *
     *
     */
    public static void main(String[] args){
        Set<String> nomes = new HashSet<String>();

        Scanner scanner = new Scanner(System.in);
        boolean res;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o "+(i+1)+"/5 nome: ");
            String resposta = scanner.nextLine();
            res = nomes.add(resposta);
            if(!res){
                System.out.println("o nome não pode ser repetido...");
                i--;
            }
        }

        System.out.println("no conjunto nomes temos : "+nomes.size()+" elementos.");
        scanner.close();

    }
}
