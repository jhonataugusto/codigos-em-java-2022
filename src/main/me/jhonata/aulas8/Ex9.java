package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro arquivo: ");
        String primeiroArquivo = scanner.nextLine();
        System.out.println("Digite o nome do segundo arquivo: ");
        String segundoArquivo = scanner.nextLine();

        primeiroArquivo = primeiroArquivo + ".txt";
        segundoArquivo = segundoArquivo + ".txt";


        try {
            Scanner primeiroArquivoScanner = new Scanner(new FileInputStream(primeiroArquivo));
            Scanner segundoArquivoScanner = new Scanner(new FileInputStream(segundoArquivo));

            PrintStream terceiroArquivo = new PrintStream(new FileOutputStream("arq3.txt",true));

            while(primeiroArquivoScanner.hasNextLine()){
                String lines = primeiroArquivoScanner.nextLine();
                terceiroArquivo.println(lines);
            }

            while(segundoArquivoScanner.hasNextLine()){
                String lines = segundoArquivoScanner.nextLine();
                terceiroArquivo.println(lines);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo!");
        }

    }
}
