package herencia.empresa.infrastructure.persistencia;

import herencia.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;

public class PersistenciaMySQLImpl implements IPersistencia {


  @Override
  public void guardarEmpleados(ArrayList<Empleado> empleados) {
    System.out.println("Los empleados se han guardado en la base de datos ...");
  }

  @Override
  public ArrayList<Empleado> leerNomina() {
    return null;
  }
}
