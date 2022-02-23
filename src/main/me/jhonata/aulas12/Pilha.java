package main.me.jhonata.aulas12;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();

    /**
     * Em uma pilha, inserimos elementos sempre no topo
     * @param nome
     */
    public void insere(String nome){
        getNomes().add(nome);
    }

    /**
     * Em uma pilha, removeremos sempre o elemento que está no topo
     * @return
     */
    public String remove(){
        return getNomes().remove(nomes.size() - 1);
    }

    /**
     *  Verifica se uma pilha está vazia.
     * @return a verificação da array com zero
     */
    public boolean vazia(){
        return nomes.size() == 0;
    }

    public String pegaTopo(){
        return nomes.get(nomes.size() - 1);
    }

    private List<String> getNomes() {
        return nomes;
    }

    private void setNomes(List<String> nomes) {
        this.nomes = nomes;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
