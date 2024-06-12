package modificadores.paqueteUno;

public class Main {

    public static void main(String[] args) {

        ClaseEnPaqueteUno uno = new ClaseEnPaqueteUno();
        // int variableLocal = uno.variable;
        uno.saludar();
        //uno.variable = 48000;
        // System.out.println(uno.variable);

        System.out.println(uno.getVariable());
        uno.setVariable(5000);
        System.out.println(uno.getVariable());

        System.out.println(uno.setVariable(50));
        System.out.println(uno.getVariable());

        uno.saludar();
    }
}
