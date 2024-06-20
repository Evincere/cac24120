package herencia.empresa.models.claseshijas;

import herencia.empresa.models.clasespadre.Empleado;

public class Desarrollador extends Empleado {

    private String lenguajeProgramacion;

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void escribirCodigo() {
        System.out.println("El desarrollador esta escribiendo codigo en " + lenguajeProgramacion);
    }
    @Override
    public void trabajar() {
        System.out.println("El desarrollador esta trabajando ...");
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
            "lenguajeProgramacion='" + lenguajeProgramacion + '\'' +
            ", nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", salario=" + salario +
            '}';
    }
}
