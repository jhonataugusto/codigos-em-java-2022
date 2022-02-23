package main.java.me.jhonata.curso.aulas.javalang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Lendo arquivos
public class LerArquivosJava {

    public static void main(String[] args) {

        try { //Como ler arquivos no java com Scanner e FileInputStream
            Scanner ler = new Scanner(new FileInputStream("entrada.txt"));

            while(ler.hasNextLine()){
                String linha = ler.nextLine();
                System.out.println(linha);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        }

    }
}
