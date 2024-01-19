package herencia_trabajador;


public class TrabajadorTipo4 extends Trabajador {
    
    private int numeroHorasTrabajadas;
    private int numeroHorasExtras;

    public TrabajadorTipo4() {
    }

    public TrabajadorTipo4(int numeroHorasTrabajadas, int numeroHorasExtras) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public TrabajadorTipo4(int numeroHorasTrabajadas, int numeroHorasExtras, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public int getNumeroHorasExtras() {
        return numeroHorasExtras;
    }

    public void setNumeroHorasExtras(int numeroHorasExtras) {
        this.numeroHorasExtras = numeroHorasExtras;
    }

    @Override
    public String toString() {
        return "TrabajadorTipo4{" + "numeroHorasTrabajadas=" + numeroHorasTrabajadas + ", numeroHorasExtras=" + numeroHorasExtras + '}';
    }

    @Override
    public double salario() {
        return this.numeroHorasTrabajadas * Constante.PHT +
               this.numeroHorasExtras * Constante.PHTE;
    }
    
}
