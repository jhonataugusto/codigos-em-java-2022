package main.me.jhonata.aulas7;

/*
 * utilizamos o try para tentar fazer algo que pode dar erro
 * utilizamos o catch para capturar o erro e oferecer ao usuario do sistema
 * uma mensagem adequada sem que quebre o programa
 * */
public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[5];

        try {

            for (int i = 0; i <= numeros.length; i++) {
                numeros[i] = i + (3 * 2);
                System.out.println(numeros[i]);
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Você está tentando acessar uma posição do array que não existe!");
            System.out.println(exception.toString());
        }


    }
}
