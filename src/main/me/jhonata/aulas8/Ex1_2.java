package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1_2 {
    @SuppressWarnings("all")
    public static void main(String[] args){

        try {

            Scanner scanner = new Scanner(new FileInputStream("arq.txt"));
            while(scanner.hasNextLine()){
                String txt = scanner.nextLine();
                for (int i = 0; i < txt.length(); i++) {
                    System.out.println(txt.charAt(i));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo.");
        }
    }
}
