package herencia.empresa.models.clasespadre;

public abstract class Empleado {

    protected String nombre;
    protected int edad;
    protected double salario;
    private static int cantidadEmpleados = 0;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        Empleado.cantidadEmpleados += 1;
    }

    public static void getCantidadEmpleados() {
        System.out.println("Se han registrado " + Empleado.cantidadEmpleados);
    }

    protected abstract void trabajar();

    @Override
    public String toString() {
        return "El empleado se llama " + nombre + " y tiene " + edad + " años";
    }
}
