package com.empresa.models;

import com.empresa.services.RecursosHumanosService;
import com.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;

public class RecursosHumanos {

  RecursosHumanosService service = new RecursosHumanosService();

  public void guardarEmpleados(ArrayList<Empleado> empleados) {
    service.guardarEmpleados(empleados);
  }

  public ArrayList<Empleado> leerNomina() {
    return new ArrayList<>();
  }
}
