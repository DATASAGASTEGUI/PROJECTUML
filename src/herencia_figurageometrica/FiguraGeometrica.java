package herencia_figurageometrica;

public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "nombre=" + nombre + '}';
    }
    
    

    public abstract double area();
    
}
