package herencia_trabajador;

public class TrabajadorTipo2 extends Trabajador {
    
    private double salarioBase;
    private double ventaRealizada;

    public TrabajadorTipo2() {
    }

    public TrabajadorTipo2(double salarioBase, double ventaRealizada) {
        this.salarioBase = salarioBase;
        this.ventaRealizada = ventaRealizada;
    }

    public TrabajadorTipo2(double salarioBase, double ventaRealizada, String idTrabajador, String nombre, String apellido) {
        super(idTrabajador, nombre, apellido);
        this.salarioBase = salarioBase;
        this.ventaRealizada = ventaRealizada;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getVentaRealizada() {
        return ventaRealizada;
    }

    public void setVentaRealizada(double ventaRealizada) {
        this.ventaRealizada = ventaRealizada;
    }

    @Override
    public String toString() {
        return "TrabajadorTipo2{" + "salarioBase=" + salarioBase + ", ventaRealizada=" + ventaRealizada + '}';
    }

    @Override
    public double salario() {
        return this.salarioBase + (Constante.PVR * this.ventaRealizada);
    }

}
