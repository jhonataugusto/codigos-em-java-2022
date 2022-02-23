package main.me.jhonata.aulas5;

//Uma interface pode conter:
// - CONSTANTES
// - Métodos abstratos


//Interface para servir de contrato para produtos eletronicos. td produto eletronico que implementar esta interface.
//OBRIGATORIAMENTE deverão implementar esses metodos abstratos

public interface IEletronico {

    public String MARCA = "Geek";

    public void ligar();

    public void desligar();

    public void tirarDaTelaCinza();

}
