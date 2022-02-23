package main.me.jhonata.aulas3;

public class Circulo {

    private final static double PI = 3.141516;
    private double raio;
    private double area;
    private double perimetro;

    public Circulo(double raio) {
        this.raio = raio;
    }


    public double getRaio() {
        return this.raio;
    }

    private void setRaio(double raio) {
        this.raio = raio;
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
        setArea(PI * getRaio() * getRaio());
    }

    public void calcularPerimetro() {
        setPerimetro(2 * PI * getRaio());
    }


    @Override
    public String toString() {
        return "area > " + getArea() + "\n" +
                "perimetro > " + getPerimetro() + "\n" +
                "-------------------------------------\n" +
                "raio > " + getRaio() + "\n";
    }
}
