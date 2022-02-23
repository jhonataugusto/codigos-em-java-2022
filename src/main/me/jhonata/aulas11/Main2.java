package main.me.jhonata.aulas11;
//Lista ligada / LinkedList

/**
 * diferença de LinkedList para o Vetor
 *
 * Em um vetor, os elementos estão um do lado do outro, enquanto em uma lista ligada, ele estão em lugares diferentes, porém
 * um aponta para o ouitro indicando o próximo elemento
 *
 * [0][3][1][2][5][4]
 */
public class Main2 {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adiciona("Jhonata");
        System.out.println(lista);
        lista.adiciona("Josiely");
        System.out.println(lista);
        lista.adicionaNoComeco("Felicity");
        System.out.println(lista);
        lista.adiciona("Ola",1);
        System.out.println(lista);

        lista.removeDoComeco();
        System.out.println(lista);
    }
}
