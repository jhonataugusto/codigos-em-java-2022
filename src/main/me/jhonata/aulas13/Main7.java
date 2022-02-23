package main.me.jhonata.aulas13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Lambdas
public class Main7 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();

        palavras.add("Geek");
        palavras.add("University");
        palavras.add("Java");
        palavras.add("Angelina");
        palavras.add("Playstation 4");
        palavras.add("Outlast 2");

        //forma 1
//        palavras.sort((s1,s2) -> {
//            if(s1.length() < s2.length()){
//                return -1;
//            } else if(s1.length() > s2.length()){
//                return 1;
//            } else{
//                return 0;
//            }
//        });

        //forma 2
        palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        palavras.forEach(s -> System.out.println(s));

    }
}
