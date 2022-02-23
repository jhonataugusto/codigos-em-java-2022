package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        String extensaoTxt = ".txt";

        String arquivo = nomeArquivo + extensaoTxt;

        try {
            Scanner lerArquivos = new Scanner(new FileInputStream(arquivo));
            int i = 0;
            while (lerArquivos.hasNextLine()) {
                String txt = lerArquivos.nextLine();
                i++;
            }

            System.out.println("o arquivo tem " + i + " linhas");

            scanner.close();
            lerArquivos.close();
        } catch (FileNotFoundException e) {
            System.out.println("não foi possivel encontrar o arquivo.");
        }
    }
}
