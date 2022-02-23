package main.me.jhonata.aulas4;

public class TreinamentoFimTemporada extends Treinamento {
    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico de fim da temporada...");
    }

    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino de fim de temporada...");
    }
}
