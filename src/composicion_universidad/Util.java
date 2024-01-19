package composicion_universidad;

public class Util {

    public static void cabecera() {
        System.out.printf("%-12s  %-6s  %-8s\n", "IDESTUDIANTE", "NOMBRE", "CARRERA");
        System.out.printf("%-12s  %-6s  %-8s\n", "------------", "------", "-------");
    }

    public static void cuerpo(String idEstudiante, String nombre, String carrera) {
        System.out.printf("%-12s  %-6s  %-8s\n", idEstudiante, nombre, carrera);
    }
}
