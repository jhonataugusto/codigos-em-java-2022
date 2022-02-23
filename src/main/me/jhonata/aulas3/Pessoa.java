package main.me.jhonata.aulas3;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;


    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    public String getNome() {
        return this.nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }


    public void imprimir() {
        System.out.println("nome: " + getNome());
        System.out.println("endereco: " + getEndereco());
        System.out.println("telefone: " + getTelefone());
    }
}
