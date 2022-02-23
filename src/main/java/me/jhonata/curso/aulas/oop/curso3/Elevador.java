package main.java.me.jhonata.curso.aulas.oop.curso3;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Elevador {
    int andarAtual = 0, totalAndares;
    double capacidade;
    List<Pessoa> totalPessoas;

    public Elevador(double capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.totalPessoas = new ArrayList<>();
    }


    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public List<Pessoa> getTotalPessoas() {
        return totalPessoas;
    }

    public void setTotalPessoas(List<Pessoa> totalPessoas) {
        this.totalPessoas = totalPessoas;
    }


    public void entra(Pessoa pessoa) {
        if (getTotalPessoas().size() < getCapacidade()) {
            getTotalPessoas().add(pessoa);
            System.out.println(pessoa.getNome() + " foi adicionado ao elevador.");
        } else {
            System.out.println("O Elevador está cheio.");
        }
    }

    public void sai(Pessoa pessoa) {
        System.out.println(pessoa.getNome() + " foi removido(a) do elevador.");
        getTotalPessoas().remove(pessoa);
    }

    public void sobe(int andar) {
        if (andar + getAndarAtual() <= getTotalAndares()) {
            setAndarAtual(andar += getAndarAtual());
            System.out.println("subindo para o " + getAndarAtual() + " andar!");
        } else {
            System.out.println("Você não pode subir mais do que isso!");
        }
    }

    public void desce(int andar) {
        if (getAndarAtual() == 0) {
            System.out.println("Não dá pra descer mais do que isso!");
        } else if (getAndarAtual() > andar) {
            setAndarAtual(getAndarAtual() - andar);
            System.out.println("Descendo para o " + getAndarAtual() + " andar!");
        }
    }

}
