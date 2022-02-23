package main.me.jhonata.aulas8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        char[] numerosEmChar = new char[10];

        for (int i = 0; i < numerosEmChar.length; i++) {

            numerosEmChar[i] = String.valueOf(i).charAt(0);
        }

        try {

            Scanner scanner = new Scanner(new FileInputStream("arq.txt"));
            String conjuntoDeCharacteres = "";
            int conjuntoDeCharacteresInt, numeroMaior = 0;

            while (scanner.hasNextLine()) {

                String linha = scanner.nextLine();



                for (int i = 0; i < linha.length(); i++) {

                    for (char value : numerosEmChar) {

                        if (linha.charAt(i) == value) {

                            //vai ser adicionado no conjunto de string
                            char c = linha.charAt(i);
                            conjuntoDeCharacteres = conjuntoDeCharacteres + c;
                        }
                    }
                }

                conjuntoDeCharacteresInt = Integer.parseInt(conjuntoDeCharacteres);
                conjuntoDeCharacteres = "0";
                //checar o numero maior
                if (conjuntoDeCharacteresInt > numeroMaior) {
                    numeroMaior = conjuntoDeCharacteresInt;
                    System.out.println("a maior cidade é :" +linha);
                }
            }
        } catch (FileNotFoundException e) {

            System.out.println("Não foi possivel localizar o arquivo.");
        }
    }
}
