package main.me.jhonata.aulas1;

public class Cliente {
    String nome;
    String endereco;


    public Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
