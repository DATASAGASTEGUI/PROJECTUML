package herencia_trabajador;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
       List<Trabajador> trabajadores_al = Data.obtenerTrabajadoresArchivoCsv();
       
       Util.cabecera();
       for(Trabajador t: trabajadores_al) {
           if(t instanceof TrabajadorTipo4) {
           //System.out.println(t.getNombre() + "  " + t.getApellido() + "  " + t.salario());
           Util.cuerpo(t.getIdTrabajador(),t.getNombre(),t.getApellido(),t.salario());
           }
       }
    }
    
}
