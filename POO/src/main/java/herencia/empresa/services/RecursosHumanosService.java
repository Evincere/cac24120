package herencia.empresa.services;

import herencia.empresa.infrastructure.persistencia.IPersistencia;
import herencia.empresa.infrastructure.persistencia.PersistenciaArchivoImpl;
import herencia.empresa.infrastructure.persistencia.PersistenciaMySQLImpl;
import herencia.empresa.models.claseshijas.Desarrollador;
import herencia.empresa.models.clasespadre.Empleado;
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
