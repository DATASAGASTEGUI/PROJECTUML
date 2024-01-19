package banco_datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Metodo {

    public static List<String> obtenerCampo(String archivo) {
        List<String> nombres_al = new ArrayList<>();

        File f;
        FileReader fr;
        BufferedReader br;

        String fila = "";

        try {
            f = new File("data/" + archivo);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            while ((fila = br.readLine()) != null) { //EOF = END OF FILE
                nombres_al.add(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nombres_al;
    }

    public static boolean grabarRegistroCsv(String cadena) {
        boolean bandera = true;
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
            f = new File("data/trabajador.csv");
            fw = new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            bw.write(cadena + "\n");
            bw.flush();//Bajar todo de la ram al disco
        } catch (Exception e) {
            e.printStackTrace();
            bandera = false;
        }
        return bandera;
    }

    public static void obtenerColumnaNregistros(int n, List<String> nombresn_al, List<String> apellidosn_al) {
        List<String> nombres_al = Metodo.obtenerCampo("nombre.txt");
        List<String> apellidos_al = Metodo.obtenerCampo("apellido.txt");

        int ri;
        int rs;

        ri = 0;
        rs = nombres_al.size() - 1;
        //LLENAR LA LISTA DE N NOMBRES
        for (int i = 0; i < n; i++) {
            String nombre = nombres_al.get(aleatorio(ri, rs));
            nombresn_al.add(nombre);
        }

        ri = 0;
        rs = apellidos_al.size() - 1;
        //LLENAR LA LISTA DE N APELLIDOS
        for (int i = 0; i < n; i++) {
            String apellido = apellidos_al.get(aleatorio(ri, rs));
            apellidosn_al.add(apellido);
        }
    }

    public static int aleatorio(int rangoInferior, int rangoSuperior) {
        int cantidadNumerosRango = (rangoSuperior + 1) - rangoInferior;
        int aleatorio = (int) (Math.random() * cantidadNumerosRango + rangoInferior);
        return aleatorio;
    }

    public static String obtenerParametros(int tipoTrabajador) {
        /*
        T1: salarioSemanalFijo [300,555]
        T2: salarioBase#ventaRealizada [350,456],[2500,2877]
        T3: numeroArticulosProducidos [200000,238968]
        T4: numeroHorasTrabajadas#numeroHorasExtras[120,150],[10,15]
         */
        String parametros = "";
        int salarioSemanalFijo, salarioBase, ventaRealizada,
                numeroArticulosProducidos, numeroHorasTrabajadas,
                numeroHorasExtras;

        switch (tipoTrabajador) {
            case 1:
                salarioSemanalFijo = Metodo.aleatorio(300, 555);
                parametros = salarioSemanalFijo + "";
                break;
            case 2:
                salarioBase = Metodo.aleatorio(350, 456);
                ventaRealizada = Metodo.aleatorio(2500, 2877);
                parametros = salarioBase + "#" + ventaRealizada;
                break;
            case 3:
                numeroArticulosProducidos = Metodo.aleatorio(200000, 238968);
                parametros = numeroArticulosProducidos + "";
                break;
            case 4:
                numeroHorasTrabajadas = Metodo.aleatorio(120, 150);
                numeroHorasExtras = Metodo.aleatorio(10, 15);
                parametros = numeroHorasTrabajadas + "#" + numeroHorasExtras;
                break;
        }
        return parametros;
    }
}
