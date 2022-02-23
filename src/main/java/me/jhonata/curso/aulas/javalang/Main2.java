package main.java.me.jhonata.curso.aulas.javalang;

import java.util.Locale;

/**
 * Java, strings são imutáveis, ou seja, não mudam.
 */
public class Main2 {

    public static void main(String[] args){
        String curso = "Programação em Java: Essencial";

        curso = curso.replace("a","i"); //ele substitui todos os caracteres

        curso = curso.toLowerCase(Locale.ROOT); //converte as letras para minusculas
        System.out.println(curso);

        curso = curso.toUpperCase(Locale.ROOT); //converte as letras para maiusculas
        System.out.println(curso);

        //uma string em java é uma array de caracteres

        System.out.println(curso.charAt(12)); // imprimindo os caracteres ao contrário
        for (int i = curso.length()-1; i >= 0; i--) {
            System.out.print(curso.charAt(i));
        }
    }
}
