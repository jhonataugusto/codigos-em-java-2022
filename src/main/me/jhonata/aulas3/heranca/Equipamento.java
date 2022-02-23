package main.me.jhonata.aulas3.heranca;

public class Equipamento {
    private String marca;
    private String modelo;

    public Equipamento(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    protected String getMarca() {
        return this.marca;
    }

    protected void setMarca(String marca) {
        this.marca = marca;
    }

    protected String getModelo() {
        return this.modelo;
    }

    protected void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "marca > " + getMarca() + "\n" +
                "modelo > " + getModelo() + "\n";
    }
}
