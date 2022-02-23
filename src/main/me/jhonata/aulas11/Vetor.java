package main.me.jhonata.aulas11;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int total = 0;


    public void adiciona(Aluno aluno){
        this.garantirEspaco();
        this.alunos[total] = aluno;
        total += 1;
    }

    public void adiciona(Aluno aluno, int posicao){
        this.garantirEspaco();
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        for (int i = total - 1; i >= posicao ; i-=1) {
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
        total++;
    }

    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição Inválida");
        }
        return this.alunos[posicao];
    }

    public void removerAluno(int posicao){
        for (int i = posicao; i < this.total ; i++) {
            this.alunos[i] = this.alunos[i+1];
        }
    }

    public boolean contem(Aluno aluno){
        //TODO descobre se o aluno está ou não na lista
        for(Aluno x : alunos){
            if(x.equals(aluno)){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        //TODO devolve a quantidade de alunos no vetor
        return this.total;
    }

    @Override
    public String toString() {
        return "Vetor{" +
                "alunos=" + Arrays.toString(alunos) + // facilita a visualização do Array
                '}';
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < total;
    }

    private void garantirEspaco(){
        //verifica se o arrays aluno está cheio
        //caso esteja cheio, cria um novo array com o dobro de tamanho do array anterior
        //copia os dados do array anterior para o novo array
        //por ultimo, atribuimos o novo array para o array original
        if(total == alunos.length){
            Aluno novoArray[] = new Aluno[alunos.length*2];
            for (int i = 0; i < alunos.length; i++) {
                novoArray[i] = alunos[i];
            }
            this.alunos = novoArray;
        }
    }
}
