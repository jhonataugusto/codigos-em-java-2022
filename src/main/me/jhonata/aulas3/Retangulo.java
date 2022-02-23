package main.me.jhonata.aulas3;

public class Retangulo {
    private double comprimento;
    private double largura;
    private double area;
    private double perimetro;


    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }


    public double getComprimento() {
        return this.comprimento;
    }

    public double getLargura() {
        return this.largura;
    }

    private double getArea() {
        return this.area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    private double getPerimetro() {
        return this.perimetro;
    }

    private void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    public void calcularArea() {
        setArea(getComprimento() * getLargura());
    }

    public void calcularPerimetro() {
        setPerimetro((2 * getComprimento()) + (2 * getLargura()));
    }


    @Override
    public String toString() {
        return "area : " + getArea() + "\n" +
                "perimetro : " + getPerimetro() + "\n" +
                "---------------------------------------\n" +
                "comprimento : " + getComprimento() + "\n" +
                "largura : " + getLargura() + "\n";
    }
}
