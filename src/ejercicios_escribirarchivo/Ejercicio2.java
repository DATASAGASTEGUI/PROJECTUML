package ejercicios_escribirarchivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ejercicio2 {

    public static void main(String[] args) {
        File f;
        FileWriter fw;
        BufferedWriter bw;
        try {
              f = new File("data/letraAleatoria.txt");
              fw = new FileWriter(f); //Crear Archivo
              bw = new BufferedWriter(fw);
              for(int i=0; i<5; i++) {
                  char letra = obtenerLetraAleatoria();
                  bw.write(letra);
              }
              bw.flush();
        }catch(Exception e) {
            System.out.println("ERROR GRABACION");
        }
    }
    
    public static char obtenerLetraAleatoria() {
       // A        Z
       //65       90  [65,90]
       int rangoInferior = 65;
       int rangoSuperior = 90;
       int cantidadNumerosRango = (rangoSuperior + 1) - rangoInferior;
       int aleatorio = (int)(Math.random() * cantidadNumerosRango + rangoInferior);
       char letra = (char)aleatorio; 
       return letra;
    }
   

}
