package treeset;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        //mostrarCadenasDistintas("data/apellidos_duplicados.txt");
        //mostrarCadenasDistintas("data/nombres_duplicados.txt");

        /*
        Set<String> cadenas_ts = obtenerListaCadenasDistintas("data/nombres_duplicados.txt");
        if (crearArchivoCadenasDistintas("data/nombre.txt", cadenas_ts)) {
            System.out.println("ESCRITURA CORRECTA NOMBRE.TXT: " + cadenas_ts.size());
        }
        */
        
        
        Set<String> cadenas_ts = obtenerListaCadenasDistintas("data/apellidos_duplicados.txt");
        if(crearArchivoCadenasDistintas("data/apellido.txt", cadenas_ts)) {
           System.out.println("ESCRITURA CORRECTA APELLIDO.TXT.TXT: " + cadenas_ts.size());
        }
        
    }

    public static Set<String> obtenerListaCadenasDistintas(String rna) {
        Set<String> cadenas_ts = new TreeSet<>();

        File f;
        FileReader fr;
        BufferedReader br;

        String fila = "";

        try {
            f = new File(rna);
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((fila = br.readLine()) != null) {
                cadenas_ts.add(fila);
            }
        } catch (Exception e) {
            System.out.println("ERROR LECTURA");
            cadenas_ts = null;
        }
        return cadenas_ts;
    }

    public static boolean crearArchivoCadenasDistintas(String rna, Set<String> cadenas_ts) {
        File f;
        FileWriter fw;
        BufferedWriter bw;

        boolean bandera = true;

        try {
            f = new File(rna);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            for (String cadena : cadenas_ts) {
                bw.write(cadena + "\n");
            }
            bw.flush();
        } catch (Exception e) {
            System.out.println("ERROR ESCRITURA");
            bandera = false;
        }
        return bandera;
    }

    public static void mostrarCadenasDistintas(String rna) {
        Set<String> nombres_ts = obtenerListaCadenasDistintas(rna);
        System.out.println("Tamaño: " + nombres_ts.size());

        int i = 1;
        for (String nombre : nombres_ts) {
            System.out.println(i + "    " + nombre);
            i++;
        }
    }
}
