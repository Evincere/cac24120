package com.empresa.models.clasespadre;

import com.empresa.models.claseshijas.Desarrollador;
import com.empresa.models.claseshijas.Disenador;
import com.empresa.models.claseshijas.Gerente;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeInfo(
  use = Id.NAME, // usa el nombre del tipo (subclase) para identificar
  property = "type" // nombre del propiedada que contendra la informacion del tipo
)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Gerente.class, name = "gerente"),
  @JsonSubTypes.Type(value = Desarrollador.class, name = "desarrollador"),
  @JsonSubTypes.Type(value = Disenador.class, name = "disenador")
})
public abstract class Empleado  {

    protected String nombre;
    protected int edad;
    protected double salario;
    private static int cantidadEmpleados = 0;

    public Empleado() {}
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static void setCantidadEmpleados(int cantidadEmpleados) {
        Empleado.cantidadEmpleados = cantidadEmpleados;
    }
}
