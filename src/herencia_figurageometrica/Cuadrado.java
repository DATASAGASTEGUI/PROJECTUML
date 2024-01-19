package herencia_figurageometrica;

public class Cuadrado extends FiguraGeometrica {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }



    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public double area() {
        return Math.pow(this.lado, 2);
    }

}
