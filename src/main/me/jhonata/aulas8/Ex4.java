package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um arquivo");
        String resposta = teclado.nextLine();

        String arquivo = resposta + ".txt";

        try{
            Scanner scanner = new Scanner(new FileInputStream(arquivo));

            int totalVogais = 0;
            int totalConsoantes = 0;

            char[] vogais = new char[5];
            vogais[0] = 'a';
            vogais[1] = 'e';
            vogais[2] = 'i';
            vogais[3] = 'o';
            vogais[4] = 'u';



            while(scanner.hasNextLine()){
                String txt = scanner.nextLine();
                for (int i = 0; i < txt.length(); i++) {
                    for (char vogal : vogais) {
                        if (txt.charAt(i) == vogal) {
                            totalVogais++;
                        } else {
                                totalConsoantes++;
                        }
                    }
                }
            }

            System.out.println("vogais : "+totalVogais);
            System.out.println("consoantes : "+totalConsoantes);

        }catch(FileNotFoundException exception){
            System.out.println("Não foi possivel encontrar o seu arquivo!");
        }
    }
}
