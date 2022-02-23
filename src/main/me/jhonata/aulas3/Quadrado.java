package main.me.jhonata.aulas3;

public class Quadrado {

    private double lado;
    private double area;
    private double perimetro;


    public Quadrado(double lado) {
        this.lado = lado;
    }


    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return this.area;
    }

    private void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return this.perimetro;
    }

    private void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    public void calcularArea() {
        setArea(getLado() * getLado());
        System.out.println("area : " + getArea());
    }

    public void calcularPerimetro() {
        setPerimetro(4 * lado);
        System.out.println("perimetro :" + getPerimetro());
    }


    @Override
    public String toString() {
        return "lados : " + getLado() + "\n"
                + "area : " + getArea() + "\n"
                + "perimetro : " + getPerimetro() + "\n";
    }
}
