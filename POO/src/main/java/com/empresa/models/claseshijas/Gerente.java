package com.empresa.models.claseshijas;

import com.empresa.models.clasespadre.Empleado;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado {

    @JsonProperty("type")
    private String type = "gerente";

    private List<Empleado> empleadosACargo = new ArrayList<>();
    private int nroEmpleados;

    public Gerente() {};
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
    public List<Empleado> getEmpleadosACargo() {
        return this.empleadosACargo;
    }

    public void setEmpleadosACargo(List<Empleado> empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }
}
