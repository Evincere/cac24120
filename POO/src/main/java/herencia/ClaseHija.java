package herencia;

public class ClaseHija extends ClaseBase {

    private String variableDeLaClaseHija;

    public ClaseHija(String variableUno){
        super(variableUno);
        this.variableDeLaClaseHija = "Algo";
    }
}
