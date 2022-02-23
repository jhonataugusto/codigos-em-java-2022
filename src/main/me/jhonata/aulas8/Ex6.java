package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um arquivo: ");
        String nomeArquivo = teclado.nextLine();
        String arquivo = nomeArquivo + ".txt";


        try {
            Scanner inputArquivo = new Scanner(new FileInputStream(arquivo));

            int soma = 0;
            while(inputArquivo.hasNextLine()){
                String lines = inputArquivo.nextLine();
                for (int i = 0; i < lines.length(); i++) {
                    char character = lines.charAt(i);
                    soma++;
                }
            }
            System.out.println("Existem "+soma+" caracteres nesse arquivo de texto.");
        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo");
        }
    }
}
