package herencia.empresa.models.claseshijas;

import herencia.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;

public class Gerente extends Empleado {

    private ArrayList<Empleado> empleadosACargo = new ArrayList<Empleado>();
    private int nroEmpleados;

    public Gerente(String nombre, int edad, double salario, int nroEmpleados) {
        super(nombre, edad, salario);
        this.nroEmpleados = nroEmpleados;
    }

    private void realizarEvaluaciones() {
        System.out.println("El gerente esta realizando evaluaciones ...");
    }

    @Override
    public void trabajar() {
        this.realizarEvaluaciones();
    }

    @Override
    public String toString() {
        return "Gerente{" +
            "nroEmpleados=" + nroEmpleados +
            ", nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", salario=" + salario +
            '}';
    }

    public void addEmpleadoACargo(Empleado empleado) {
        if(!(empleado instanceof Gerente)) {
            this.empleadosACargo.add(empleado);
        }else{
            System.out.println("Ese empleado no puede estar a su cargo");
        }
    }

    public int getNroEmpleados() {
        return this.empleadosACargo.size();
    }
    public ArrayList<Empleado> getEmpleadosACargo() {
        return this.empleadosACargo;
    }
}
