package main.java.me.jhonata.curso.aulas.ifElse;

//operador ternário
public class Aula1 {
    //digite "main" para criar o codigo
    public static void main(String[] args) {
        int valor = 3, numero;
        if (valor < 0) {
            numero = valor;
        } else {
            numero = 7;
        }

        numero = (valor < 0) ? valor : 7; //para receber valores

        switch (numero) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }
}
