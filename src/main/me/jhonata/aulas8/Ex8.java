package main.me.jhonata.aulas8;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args){
        try {
            Scanner arquivo = new Scanner(new FileInputStream("arq.txt"));
            PrintStream arquivo2 = new PrintStream(new FileOutputStream("arq2.txt",true));

            while(arquivo.hasNextLine()){
                String lines = arquivo.nextLine();
                lines.toUpperCase(Locale.ROOT);
                arquivo2.println(lines);


            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
    }
}
