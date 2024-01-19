package herencia_trabajador;

public class Util {
   
    public static void cabecera() {
        System.out.printf("%-11s  %-10s  %-10s  %10s\n","IDTRABAJDOR","NOMBRE","APELLIDO","SALARIO");
        System.out.printf("%-11s  %-10s  %-10s  %10s\n","-----------","------","--------","-------");
    } 
    
    public static void cuerpo(String idTrabajador,String nombre, String apellido, double salario) {
        System.out.printf("%-11s  %-10s  %-10s  %10.2f\n",idTrabajador,nombre,apellido,salario);
    }
}
