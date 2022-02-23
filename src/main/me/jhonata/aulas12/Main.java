package main.me.jhonata.aulas12;

/**
 * pilhas = são estruturas de dados onde o elemento que está visivel/disponível é o que está sempre no topo.
 *
 * os elementos, ao serem adicionados em uma pilha, são adicionados sempre no topo.
 * para remover elementos da pilha, só podemos remover o topo.
 */
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.insere("Angelina");
        pilha.insere("Felicity");
        System.out.println(pilha);

        pilha.remove();
        System.out.println(pilha);
    }
}
