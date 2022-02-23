package main.me.jhonata.aulas12;


import java.util.LinkedList;
import java.util.List;

/**
 * Todo elemento entra no final da fila
 * o primeiro elemento a entrar é também o primeiro a sair.
 */
public class Filas {
    private List<String> nomes = new LinkedList<>();


    public void adiciona(String nome){
        this.nomes.add(nome);
    }

    public String remove(){
        try{
            return nomes.remove(0);
        }catch(IndexOutOfBoundsException e){
            System.out.println("A lista já está vazia");
        }
        return "";
    }

    public boolean vazia(){
        return this.nomes.size() == 0;
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}
