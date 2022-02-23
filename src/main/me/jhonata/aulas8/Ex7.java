package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome de um arquivo!");
        String nomeArquivo = teclado.nextLine();
        String arquivo = nomeArquivo + ".txt";

        int aux = 0;
        try {
            Scanner inputArquivo = new Scanner(new FileInputStream(arquivo));
            PrintStream novoArquivo = new PrintStream(new FileOutputStream("arquivo.txt",true));

            while (inputArquivo.hasNextLine()) {
                String lines = inputArquivo.nextLine();
                novoArquivo.println(lines);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel encontrar o arquivo!");
        }
    }
}
