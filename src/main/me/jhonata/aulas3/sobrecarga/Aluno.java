package main.me.jhonata.aulas3.sobrecarga;

import main.me.jhonata.aulas3.Circulo;

public class Aluno extends Pessoa {
    private int ra;

    public Aluno(int ra) {
        this.ra = ra;
    }

    public Aluno(int codigo, String nome, int idade, int ra) {
        super(codigo, nome, idade);
        this.ra = ra;
    }

    public Aluno(int codigo, String nome, int idade, Circulo circulo, int ra) {
        super(codigo, nome, idade, circulo);
        this.ra = ra;
    }


    @Override
    public void mensagem(String msg) {

    }
}
