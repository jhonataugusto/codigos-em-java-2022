package main.me.jhonata.aulas11;


/**
 * Classe que reresenta uma celula (container) onde teremos
 * o objeto (valor) e uma celula que será a ligação para o próximo.
 *
 * @author jhonata
 */
public class Celula {
    private Object elemento;
    private Celula proximo;
    private Celula anterior;

    public Celula(Object elemento,Celula proximo){
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula(Object elemento){
        this(elemento,null);
    }


    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
}
