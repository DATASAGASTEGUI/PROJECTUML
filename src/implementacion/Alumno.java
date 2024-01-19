package implementacion;

public class Alumno {

    private int idAlumno;
    private String nombre;
    private double estatura;
    private int edad;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre, double estatura, int edad) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.estatura = estatura;
        this.edad = edad;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", estatura=" + estatura + ", edad=" + edad + '}';
    }

    public String esAdulto() {
        if (this.edad >= 18) {
            return "ADULTO";
        } else {
            return "MENOR";
        }
    }
}
