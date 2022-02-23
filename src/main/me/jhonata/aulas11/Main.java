package main.me.jhonata.aulas11;

/**
 * int[] numeros = new int[5];
 *
 * numeros[0] = 1;
 * numeros[1] = 2;
 * numeros[2] = 3;
 * numeros[3] = 4;
 * numeros[4] = 5;
 *
 */
public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jhonata");
        Aluno a2 = new Aluno("Josiely");
        Aluno a3 = new Aluno("Maria");
        Aluno a4 = new Aluno("Jose");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        lista.adiciona(a3,1);
        lista.removerAluno(0);
        System.out.println(lista);



    }

}
