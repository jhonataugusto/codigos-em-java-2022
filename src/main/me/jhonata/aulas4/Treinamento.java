package main.me.jhonata.aulas4;
//Template Method

/*
 * - Final é um modificador de acesso que faz com que o elemento que esteja utilizando, não possa ser extendido/reescrito.
 * */
public abstract class Treinamento {
    //Template Method
    public final void treinoDiario() {
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();

    public abstract void jogoTreino();

    public final void treinoTatico() { // o treino tático vai ser igual pra td mundo!
        System.out.println("Treino tático...");
    }
}
