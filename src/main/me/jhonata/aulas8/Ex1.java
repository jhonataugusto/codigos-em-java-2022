package main.me.jhonata.aulas8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Objects;
import java.util.Scanner;

@SuppressWarnings("all")
public class Ex1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            PrintStream arquivo = new PrintStream(new FileOutputStream("arq.txt",true));

            boolean endLoop = false;

            do{
                System.out.println("Digite um caractere");
                String txt = scanner.nextLine();
                arquivo.println(txt);
                if(Objects.equals(txt, "0")){
                    endLoop = true;
                    break;
                }
            }while(!endLoop);

            scanner.close();
            arquivo.close();

        }catch(FileNotFoundException exception){
            System.out.println("não foi possivel encontrar o arquivo.");
        }

    }
}
