package herencia.empresa.models.claseshijas;

import herencia.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;

public class Disenador extends Empleado {
    private final String herramientaDisenio;
    private ArrayList<String> herramientasDisponibles = new ArrayList<String>();

    public Disenador(String nombre, int edad, double salario, String herramientaDisenio) {
        super(nombre, edad, salario);
        this.herramientaDisenio = herramientaDisenio;
        herramientasDisponibles.add(herramientaDisenio);
    }

    private void crearDisenio() {
        System.out.println("El diseñador esta creando un diseño usando " + herramientaDisenio);
    }

    @Override
    public void trabajar() {
        this.crearDisenio();
    }

    @Override
    public String toString() {
        return "Diseñador{" +
            "herramientaDisenio='" + herramientaDisenio + '\'' +
            ", nombre='" + nombre + '\'' +
            ", edad=" + edad +
            ", salario=" + salario +
            '}';
    }

    public ArrayList<String> getHerramientasDisponibles() {
        return herramientasDisponibles;
    }

    public void addHerramientas(String nuevaHerramienta) {
        this.herramientasDisponibles.add(nuevaHerramienta);
    }


}
