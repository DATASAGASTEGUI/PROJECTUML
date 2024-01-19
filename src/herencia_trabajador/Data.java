package herencia_trabajador;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Data {

    public static List<Trabajador> obtenerTrabajadores() {
        List<Trabajador> trabajadores_al = new ArrayList<>();
        trabajadores_al.add(new TrabajadorTipo1(450.56, "T1", "Luis", "Rabanal"));
        trabajadores_al.add(new TrabajadorTipo2(350, 2877, "T2", "Miguel", "Roncal"));
        trabajadores_al.add(new TrabajadorTipo3(238968, "T3", "Carmen", "Jauregui"));
        trabajadores_al.add(new TrabajadorTipo4(150, 15, "T4", "María", "Zavaleta"));
        return trabajadores_al;
    }

    public static List<Trabajador> obtenerTrabajadoresArchivoCsv() {
        List<Trabajador> trabajadores_al = new ArrayList<>();

        File f;
        FileReader fr;
        BufferedReader br;

        String fila = "";
        String[] parte;

        try {
            f = new File("data/trabajador.csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((fila = br.readLine()) != null) {
                parte = fila.split(";");
                if (parte[3].equalsIgnoreCase("1")) {
                    TrabajadorTipo1 t1 = new TrabajadorTipo1(Double.parseDouble(parte[4]),
                                                             parte[0],
                                                             parte[1],
                                                             parte[2]);
                    trabajadores_al.add(t1);
                }
                if(parte[3].equalsIgnoreCase("2")) {
                    //double salarioBase, double ventaRealizada, String idTrabajador, String nombre, String apellido
                    String[] p = parte[4].split("#");
                    TrabajadorTipo2 t2 = new TrabajadorTipo2(Double.parseDouble(p[0]),
                                                             Double.parseDouble(p[1]),
                                                             parte[0],
                                                             parte[1],
                                                             parte[2]);
                    trabajadores_al.add(t2);
                }
                if(parte[3].equalsIgnoreCase("3")) {
                   //int numeroArticulosProducidos, String idTrabajador, String nombre, String apellido
                   TrabajadorTipo3 t3 = new TrabajadorTipo3(Integer.parseInt(parte[4]),
                                                            parte[0],
                                                            parte[1],
                                                            parte[2]);
                   trabajadores_al.add(t3);
                }
                if(parte[3].equalsIgnoreCase("4")) {
                   //int numeroHorasTrabajadas, int numeroHorasExtras, String idTrabajador, String nombre, String apellido
                   String[] p = parte[4].split("#");
                   TrabajadorTipo4 t4 = new TrabajadorTipo4(Integer.parseInt(p[0]),
                                                            Integer.parseInt(p[1]),
                                                            parte[0],
                                                            parte[1],
                                                            parte[2]);
                   trabajadores_al.add(t4);
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR LECTURA");
            trabajadores_al = null;
        }
        return trabajadores_al;
    }

}
