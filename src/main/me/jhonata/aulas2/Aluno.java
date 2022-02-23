package main.me.jhonata.aulas2;

public class Aluno extends Pessoa {
    private int ra;

    Aluno(String nome, int anoNascimento, int ra) {
        super(nome, anoNascimento); //isso é comando dos conceitos de herança
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                '}';
    }
}
