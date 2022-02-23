package main.me.jhonata.aulas11;

import java.util.Objects;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    @Override
    public boolean equals(Object o) {
        Aluno obj = (Aluno) o;
        return obj.getNome().equals(this.nome);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                '}';
    }
}
