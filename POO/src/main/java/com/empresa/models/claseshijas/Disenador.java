package com.empresa.models.claseshijas;

import com.empresa.models.clasespadre.Empleado;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class Disenador extends Empleado {
    @JsonProperty("type")
    private String type = "disenador";
    private String herramientaDisenio;
    private ArrayList<String> herramientasDisponibles = new ArrayList<>();

    public Disenador() {}
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

    public String getHerramientaDisenio() {
        return herramientaDisenio;
    }

    public void setHerramientaDisenio(String herramientaDisenio) {
        this.herramientaDisenio = herramientaDisenio;
    }

    public void setHerramientasDisponibles(ArrayList<String> herramientasDisponibles) {
        this.herramientasDisponibles = herramientasDisponibles;
    }
}
