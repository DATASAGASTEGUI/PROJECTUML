package implementacion;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Alumno> obtenerAlumnos() {
        List<Alumno> alumnos_al = new ArrayList<>();
        alumnos_al.add(new Alumno(1, "Luis", 1.72, 17));
        alumnos_al.add(new Alumno(2, "Carlos", 1.73, 19));
        alumnos_al.add(new Alumno(3, "Miguel", 1.74, 18));
        alumnos_al.add(new Alumno(4, "María", 1.75, 16));
        return alumnos_al;
    }
}
