package com.empresa.services;

import com.empresa.infrastructure.persistencia.IPersistencia;
import com.empresa.infrastructure.persistencia.PersistenciaArchivoImpl;
import com.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;

public class RecursosHumanosService implements IPersistencia {

  IPersistencia sistemaDePersistencia = new PersistenciaArchivoImpl();

  @Override
  public void guardarEmpleados(ArrayList<Empleado> empleados) {
    sistemaDePersistencia.guardarEmpleados(empleados);
  }

  @Override
  public ArrayList<Empleado> leerNomina() {
    return null;
  }
}
