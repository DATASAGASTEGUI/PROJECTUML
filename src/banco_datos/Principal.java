package banco_datos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
LEYENDA
NOMBRE ARCHIVO: TRABAJADOR.CSV  
ESTRUCTURA CSV: IDTRABAJADOR;NOMBRE;APELLIDO;TIPOTRABAJADOR;PARAMETROS;
*/

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Cantidad Registros Banco Datos? ");
        int n = sc.nextInt();

        List<String> nombresn_al = new ArrayList<>();
        List<String> apellidosn_al = new ArrayList<>();
        Metodo.obtenerColumnaNregistros(n, nombresn_al, apellidosn_al);

        for (int i = 0; i < n; i++) {
            int tipoTrabajador = Metodo.aleatorio(1, 4);
            String parametros = Metodo.obtenerParametros(tipoTrabajador);
            String idTrabajador = "T" + (i + 1);
            String registrocsv = idTrabajador + ";"
                    + nombresn_al.get(i) + ";"
                    + apellidosn_al.get(i) + ";" + tipoTrabajador + ";" + parametros;
            System.out.println(registrocsv);
            if(Metodo.grabarRegistroCsv(registrocsv)) {
                System.out.println("ESCRITURA OK");
            }else {
                System.out.println("ERROR");
            }
        }
    }
/*
    public static void probarLectura() {
        List<String> nombres_al = Metodo.obtenerCampo("apellido.txt");
        for (String s : nombres_al) {
            System.out.println(s);
        }
    }
*/
}
