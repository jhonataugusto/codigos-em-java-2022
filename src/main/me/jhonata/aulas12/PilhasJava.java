package main.me.jhonata.aulas12;

import java.util.Stack;

public class PilhasJava {
    public static void main(String[] args) {
        Stack<String> nomes = new Stack<String>();

        nomes.push("Angelina");
        nomes.push("Felicity");
        System.out.println(nomes);

        nomes.pop();

        System.out.println(nomes);

        String ret = nomes.peek(); //retorna o elemento do topo

        System.out.println(ret);
    }
}
