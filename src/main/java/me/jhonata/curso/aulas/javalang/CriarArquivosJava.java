package main.java.me.jhonata.curso.aulas.javalang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CriarArquivosJava {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            PrintStream escrever = new PrintStream(new FileOutputStream("saida.txt",true));

            for (int i = 0; i < 5; i++) {
                System.out.println("Escreva algo");
                String msg = teclado.nextLine();
                escrever.println(msg);
            }

            escrever.close();

        } catch (FileNotFoundException e) {
            System.out.println("não foi possivel criar o arquivo!");
        }

        teclado.close();
    }
}
