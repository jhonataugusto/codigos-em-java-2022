package main.me.jhonata.aulas3.sobrecarga;

import main.me.jhonata.aulas3.Circulo;

public abstract class Pessoa {

    private int codigo;
    private String nome;
    private int idade;
    private Circulo circulo;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, int idade) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        System.out.println("Construtor padrão");

    }

    public Pessoa(int codigo, String nome, int idade, Circulo circulo) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.circulo = circulo;
    }

    private int getCodigo() {
        return this.codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getIdade() {
        return this.idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    String toString(int x) {
        if (x == 1) {
            return "codigo > " + getCodigo() + "\n" +
                    "nome > " + getNome() + "\n" +
                    "idade >" + getIdade() + "\n";
        } else {
            return "codigo > " + getCodigo() + "\n" +
                    "nome > " + getNome() + "\n";
        }
    }

    @Override
    public String toString() {
        return "codigo > " + getCodigo() + "\n" +
                "nome > " + getNome() + "\n" +
                "idade >" + getIdade() + "\n";
    }

    public abstract void mensagem(String msg);

}
