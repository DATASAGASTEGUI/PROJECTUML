package herencia_trabajador;

public abstract class Trabajador {

    private String idTrabajador;
    private String nombre;
    private String apellido;

    public Trabajador() {
    }

    public Trabajador(String idTrabajador, String nombre, String apellido) {
        this.idTrabajador = idTrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "idTrabajador=" + idTrabajador + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    public abstract double salario();
    
}
