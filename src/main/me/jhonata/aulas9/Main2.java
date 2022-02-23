package main.me.jhonata.aulas9;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(18);
        numeros.add(21);
        numeros.add(35);
        numeros.add(42);
        numeros.add(65);

        Collections.sort(numeros); //ordena os valores

        for(int i : numeros){
            System.out.println(i);
        }
    }
}
