package herencia.empresa.models.clasespadre;

public class Empleado {

    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void trabajar() {
        System.out.println("El empleado esta trabajando ...");
    }

    @Override
    public String toString() {
        return "El empleado se llama " + nombre + " y tiene " + edad + " años";
    }
}
