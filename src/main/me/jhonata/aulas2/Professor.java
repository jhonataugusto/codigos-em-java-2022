package main.me.jhonata.aulas2;

public class Professor extends Pessoa {
    private int matricula;

    public Professor(String nome, int anoNascimento, int matricula) {
        super(nome, anoNascimento);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
