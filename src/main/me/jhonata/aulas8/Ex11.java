package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do arquivo: ");
        String nomeArquivo = scanner.nextLine();

        System.out.println("Informe o nome da string que deseja procurar: ");
        String string = scanner.nextLine();

        nomeArquivo = nomeArquivo + ".txt";

        int aux = 0;

        try {

            Scanner arquivo = new Scanner(new FileInputStream(nomeArquivo));

            while(arquivo.hasNextLine()){
                String linha = arquivo.nextLine();
                if(linha.contains(string)){
                    aux++;
                }
            }

            System.out.println("a palavra : "+string+" aparece : "+aux+" vezes nesse arquivo.");
            System.out.println("ainda tá errado isso aqui KKKKKKKKKKKKKKKKKK");

        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel localizar o arquivo.");
        }
    }
}
