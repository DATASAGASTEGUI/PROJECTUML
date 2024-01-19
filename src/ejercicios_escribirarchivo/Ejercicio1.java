package ejercicios_escribirarchivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ejercicio1 {

    public static void main(String[] args) {
        File f; //Convierte en objeto el archivo
        FileWriter fw; //Abrir un flujo de salida hacia un archivo (Crear Archivo)
        BufferedWriter bw; //Grabar Archivo
        try {
            f = new File("data/letras.txt");
            fw = new FileWriter(f); //Crear Archivo
            bw = new BufferedWriter(fw); //Grabar Archivo 

            for (int i = 65; i <= 90; i++) {
                char letra = (char) i;
                bw.write(letra + "\n");
                if(letra == 'N') {
                   bw.write('Ñ' + "\n");
                }
                bw.flush();
            }
        } catch (Exception e) {
            System.out.println("ERROR GRABACION");
        }
    }
}
