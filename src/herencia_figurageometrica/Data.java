package herencia_figurageometrica;

import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<FiguraGeometrica> obtenerFigurasGeometricas() {
        List<FiguraGeometrica> figurasgeometricas_al = new ArrayList<>();
        figurasgeometricas_al.add(new Triangulo(2, 5, "Triangulo 1"));
        figurasgeometricas_al.add(new Triangulo(1, 4, "Triangulo 2"));
        figurasgeometricas_al.add(new Rectangulo(8, 5, "Rectangulo 1"));
        figurasgeometricas_al.add(new Rectangulo(7, 4, "Rectangulo 2"));
        figurasgeometricas_al.add(new Circulo(9, "Circulo 1"));
        figurasgeometricas_al.add(new Circulo(3, "Circulo 2"));
        figurasgeometricas_al.add(new Cuadrado(4, "Cuadrado 1"));
        figurasgeometricas_al.add(new Cuadrado(2, "Cuarado 2"));
        return figurasgeometricas_al;
    }
}
