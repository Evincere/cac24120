package herencia.empresa.models.claseshijas;

import herencia.empresa.models.clasespadre.Empleado;

public class Gerente extends Empleado {

    private int nroEmpleados;

    public Gerente(String nombre, int edad, double salario, int nroEmpleados) {
        super(nombre, edad, salario);
        this.nroEmpleados = nroEmpleados;
    }

    public void realizarEvaluaciones() {
        System.out.println("El gerente esta realizando evaluaciones ...");
    }

    @Override
    public void trabajar() {
        System.out.println("El gerente esta gestionando el equipo ...");
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
}
