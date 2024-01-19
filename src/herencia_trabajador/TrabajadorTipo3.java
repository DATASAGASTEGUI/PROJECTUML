package herencia_trabajador;

public class TrabajadorTipo3 extends Trabajador {
    
    private int numeroArticulosProducidos;

    public TrabajadorTipo3() {
    }

    public TrabajadorTipo3(int numeroArticulosProducidos) {
        this.numeroArticulosProducidos = numeroArticulosProducidos;
    }

    public TrabajadorTipo3(int numeroArticulosProducidos, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.numeroArticulosProducidos = numeroArticulosProducidos;
    }

    public int getNumeroArticulosProducidos() {
        return numeroArticulosProducidos;
    }

    public void setNumeroArticulosProducidos(int numeroArticulosProducidos) {
        this.numeroArticulosProducidos = numeroArticulosProducidos;
    }

    @Override
    public String toString() {
        return "TrabajadorTipo3{" + "numeroArticulosProducidos=" + numeroArticulosProducidos + '}';
    }

    @Override
    public double salario() {
        return Constante.PNAP * this.numeroArticulosProducidos;
    }
    
    
}
