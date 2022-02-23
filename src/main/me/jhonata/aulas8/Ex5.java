package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String nomeArquivo = teclado.nextLine();

        System.out.println("Digite o caractere desejado: ");
        String caractere = teclado.nextLine();

        String arquivoTxt = nomeArquivo + ".txt";

        try {

            Scanner scanner = new Scanner(new FileInputStream(arquivoTxt));

            int aux = 0;
            while(scanner.hasNextLine()){
                String txt = scanner.nextLine();
                for (int i = 0; i < txt.length(); i++) {
                    char proxChar = caractere.charAt(0);
                    if(txt.charAt(i) == proxChar){
                        aux++;
                    }
                }
            }

            System.out.println("existem "+aux+" caracteres no texto : "+arquivoTxt);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
