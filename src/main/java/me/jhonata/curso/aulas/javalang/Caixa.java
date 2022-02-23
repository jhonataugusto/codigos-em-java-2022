package main.java.me.jhonata.curso.aulas.javalang;

import main.me.jhonata.aulas3.Microondas;
import main.me.jhonata.aulas6.Conta;

public class Caixa {
    private Object[] objetos;
    private int posicaoLivre;

    public Caixa(){
        this.objetos = new Object[100]; // até 100 objetos
        this.posicaoLivre = 0;
    }

    public void adicionar(Object nova){
        this.objetos[this.posicaoLivre] = nova;
        this.posicaoLivre++;
    }


    public Object pegar(int posicao){
        return this.objetos[posicao];
    }
}
