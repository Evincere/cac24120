package herencia.empresa.models.claseshijas;

import herencia.empresa.models.clasespadre.Empleado;

public class Desarrollador extends Empleado  {

    private String[] lenguajesConocidos = new String[0];
    private String lenguajeActual;
    public Desarrollador() {}

    public Desarrollador(String nombre, int edad, double salario, String lenguajeProgramacion) {
        super(nombre, edad, salario);
        this.lenguajeActual = lenguajeProgramacion;
    }

    public Desarrollador(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.lenguajeActual = "";
    }

    private void escribirCodigo() {
        System.out.println("El desarrollador esta escribiendo codigo en " + lenguajeActual);
    }
    @Override
    public void trabajar() {
        this.escribirCodigo();
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
            "lenguajeProgramacion='" + lenguajeActual + '\'' +
            ", nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", salario=" + salario +
            '}';
    }

    public String[] getLenguajesConocidos() {
        return lenguajesConocidos;
    }

    private void setLenguajesConocidos(String[] lenguajesConocidos) {
        this.lenguajesConocidos = lenguajesConocidos;
    }

    public void addLenguajesConocidos(String nuevoLenguaje) {
        String[] nuevoStack = new String[lenguajesConocidos.length + 1];
        System.arraycopy(lenguajesConocidos, 0, nuevoStack, 0, lenguajesConocidos.length);
        nuevoStack[nuevoStack.length - 1] = nuevoLenguaje;
        this.setLenguajesConocidos(nuevoStack);
    }

    public String getLenguajeActual() {
        if(this.lenguajeActual.isBlank()) return "No hay un lenguaje actual";
        return lenguajeActual;
    }
}
