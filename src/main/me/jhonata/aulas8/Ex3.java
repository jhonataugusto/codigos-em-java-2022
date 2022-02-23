package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {



        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um arquivo:");
            String texto = scanner.nextLine();

            String arquivoConcatenado = texto + ".txt";

            Scanner arquivo = new Scanner(new FileInputStream(arquivoConcatenado));

            int somaVogais = 0;

            char[] vogais = new char[5];

            vogais[0] = 'a';
            vogais[1] = 'e';
            vogais[2] = 'i';
            vogais[3] = 'o';
            vogais[4] = 'u';

            while(arquivo.hasNextLine()){
                String txt = arquivo.nextLine();
                for (int i = 0; i < txt.length(); i++) {
                    char caractere = txt.charAt(i);
                    for (int j = 0; j < vogais.length; j++) {
                        if(caractere == vogais[j]){
                            somaVogais++;
                        }
                    }
                }
            }

            System.out.println("há "+somaVogais+" vogais no texto todo.");

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo!");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Você está tentando acessar uma posição de alguma array que não existe!");
            exception.printStackTrace();
        }
    }
}
