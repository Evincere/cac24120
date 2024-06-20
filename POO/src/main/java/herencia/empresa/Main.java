package herencia.empresa;

import herencia.empresa.models.claseshijas.Desarrollador;
import herencia.empresa.models.claseshijas.Disenador;
import herencia.empresa.models.claseshijas.Gerente;
import herencia.empresa.models.clasespadre.Empleado;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pepito", 40,2000);
        System.out.println(empleado);
        empleado.trabajar();

        Empleado gerente = new Gerente("Semper", 45, 3000, 10);
        gerente.trabajar();
        gerente.realizarEvaluaciones();

        Empleado disenador = new Disenador("PepitoDiseñador", 40, 1000, "Photoshop");
        disenador.trabajar();
        disenador.crearDisenio();

        Desarrollador desarrollador = new Desarrollador("JacintoProgramador", 28, 2000, "Java");
        desarrollador.trabajar();
        desarrollador.escribirCodigo();

    }
}
