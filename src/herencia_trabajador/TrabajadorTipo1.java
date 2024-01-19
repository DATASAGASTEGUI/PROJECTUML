package herencia_trabajador;

public class TrabajadorTipo1 extends Trabajador {
    
    private double salarioSemanalFijo;

    public TrabajadorTipo1() {
    }

    public TrabajadorTipo1(double salarioSemanalFijo) {
        this.salarioSemanalFijo = salarioSemanalFijo;
    }

    public TrabajadorTipo1(double salarioSemanalFijo, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.salarioSemanalFijo = salarioSemanalFijo;
    }

    public double getSalarioSemanalFijo() {
        return salarioSemanalFijo;
    }

    public void setSalarioSemanalFijo(double salarioSemanalFijo) {
        this.salarioSemanalFijo = salarioSemanalFijo;
    }

    @Override
    public String toString() {
        return "TrabajadorTipo1{" + "salarioSemanalFijo=" + salarioSemanalFijo + '}';
    }

    @Override
    public double salario() {
        return this.salarioSemanalFijo * 4;
    }

}
