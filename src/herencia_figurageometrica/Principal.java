package herencia_figurageometrica;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<FiguraGeometrica> figurasgeometricas_al = Data.obtenerFigurasGeometricas();
        for(FiguraGeometrica fg: figurasgeometricas_al) {
            System.out.print(fg);
            System.out.println("  Area: " + fg.area() + " " + fg.getNombre());
        }
    }
    
}
