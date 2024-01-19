package composicion_universidad;

public class Estudiante {
    
    private String idEstudiante;
    private String nombre;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String idEstudiante, String nombre, String carrera) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", carrera=" + carrera + '}';
    }
    
}
