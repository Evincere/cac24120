package modificadores.paqueteUno;

public class ClaseEnPaqueteUno {

    private int variable = 48;

    public void saludar() {
        System.out.println("Hola 24120" + metodoPrivado("son la mejor comisión "));
    }

    private String metodoPrivado(String cadena){
       return cadena.toUpperCase();
    }


    // getter y setter
    public int getVariable() {
        return variable;
    }

    public String setVariable(int variable) {
        if(variable < 40 || variable > 1000) {
            this.variable = variable;
            return "Si se pudo establecer el valor";
        }else{
            return "No se pudo establecer el valor";
        }
    }
}
