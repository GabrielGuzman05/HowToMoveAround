package problema;

import java.util.*;

public class Paradero {

    public ArrayList<String> lineas;
    private String codigo;

    public Paradero(String c) {
        this.codigo = c;
        this.lineas = new ArrayList();
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void addLinea(String nombreLinea) {
        lineas.add(nombreLinea);
    }

    public ArrayList<String> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<String> lineas) {
        this.lineas = lineas;
    }

}
