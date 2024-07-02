package com.empresa.infrastructure.persistencia;

import com.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;

public interface IPersistencia {

  void guardarEmpleados(ArrayList<Empleado> empleados);
  ArrayList<Empleado> leerNomina();
}
