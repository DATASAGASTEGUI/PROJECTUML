package composicion_universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private String nombre;
    private List<Estudiante> estudiantes_al;

    public Universidad() {
        this.estudiantes_al = new ArrayList<>();
    }

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes_al = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getEstudiantes_al() {
        return estudiantes_al;
    }

    public void agregarEstudiante(String idEstudiante, String nombre, String carrera) {
        Estudiante e = new Estudiante(idEstudiante,nombre,carrera);
        estudiantes_al.add(e);
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", estudiantes_al=" + estudiantes_al + '}';
    }
    
    
}
