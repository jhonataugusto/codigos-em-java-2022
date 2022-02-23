package main.me.jhonata.aulas4;

public class Main {
    public static void main(String[] args) {
        TreinamentoInicioTemporada tit = new TreinamentoInicioTemporada();
        TreinamentoFimTemporada tft = new TreinamentoFimTemporada();

        tit.treinoDiario();
        tft.treinoDiario(); //execuções do template Method!
    }
}
