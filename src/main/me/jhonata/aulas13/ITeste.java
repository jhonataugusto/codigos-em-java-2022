package main.me.jhonata.aulas13;

public interface ITeste {
    int valor = 9;

    public String mensagem();


    //METODO DEFAULT
    default void meu_metodo() {
        System.out.println("Meu default method...");
    }
}
