package herencia;

public class ClaseBase {

    protected String variableUno;
    protected String variableDos;
    protected String variableTres;

    public ClaseBase(String variableUno) {
        setVariableUno(variableUno);
    }

    public String getVariableUno() {
        return variableUno;
    }

    public void setVariableUno(String variableUno) {
        this.variableUno = variableUno;
    }

    public String getVariableDos() {
        return variableDos;
    }

    public void setVariableDos(String variableDos) {
        this.variableDos = variableDos;
    }

    public String getVariableTres() {
        return variableTres;
    }

    public void setVariableTres(String variableTres) {
        this.variableTres = variableTres;
    }
}
