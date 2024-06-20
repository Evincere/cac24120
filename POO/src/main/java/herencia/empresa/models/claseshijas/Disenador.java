package herencia.empresa.models.claseshijas;

import herencia.empresa.models.clasespadre.Empleado;

public class Disenador extends Empleado {
    private String herramientaDisenio;

    public Disenador(String nombre, int edad, double salario, String herramientaDisenio) {
        super(nombre, edad, salario);
        this.herramientaDisenio = herramientaDisenio;
    }

    public void crearDisenio() {
        System.out.println("El diseñador esta creando un diseño usando " + herramientaDisenio);
    }

    @Override
    public void trabajar() {
        System.out.println("El diseñador esta trabajando ...");
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
}
