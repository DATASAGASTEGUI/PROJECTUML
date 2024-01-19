package implementacion;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        List<Alumno> alumnos_al = Data.obtenerAlumnos();
        for(Alumno a: alumnos_al) {
            System.out.println(a);
        }
        
    }
    
}
