package herencia.empresa;

import herencia.empresa.models.RecursosHumanos;
import herencia.empresa.models.claseshijas.Desarrollador;
import herencia.empresa.models.claseshijas.Disenador;
import herencia.empresa.models.claseshijas.Gerente;
import herencia.empresa.models.clasespadre.Empleado;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Semper", 45, 3000, 10);
        Disenador disenador = new Disenador("PepitoDiseñador", 40, 1000, "Photoshop");
        Desarrollador desarrollador = new Desarrollador("JacintoProgramador", 28, 2000, "Java");
        Empleado gerenteSuplente = new Gerente("Camila", 28, 2000, 10 );
        Empleado desarrolladorSinLenguaje = new Desarrollador("Paco", 20, 1000);

        if(gerenteSuplente instanceof Gerente) {
            ((Gerente) gerenteSuplente).trabajar();
        }
        gerente.trabajar();
        disenador.trabajar();
        desarrollador.trabajar();

        System.out.println(desarrollador.getLenguajeActual());
        System.out.println(((Desarrollador) desarrolladorSinLenguaje).getLenguajeActual());
        ((Desarrollador) desarrolladorSinLenguaje).addLenguajesConocidos("Python");
        System.out.println(
            Arrays.toString(((Desarrollador) desarrolladorSinLenguaje).getLenguajesConocidos()));

        disenador.addHerramientas("Figma");
        System.out.println(disenador.getHerramientasDisponibles());

        gerente.addEmpleadoACargo(desarrollador);
        gerente.addEmpleadoACargo(disenador);
        gerente.addEmpleadoACargo(desarrolladorSinLenguaje);
        gerente.addEmpleadoACargo(gerenteSuplente);
        gerente.addEmpleadoACargo(gerente);

        System.out.println(gerente.getNroEmpleados());

        Empleado.getCantidadEmpleados();

        RecursosHumanos oficinaRRHH = new RecursosHumanos();
        oficinaRRHH.guardarEmpleados(gerente.getEmpleadosACargo());
    }
}
