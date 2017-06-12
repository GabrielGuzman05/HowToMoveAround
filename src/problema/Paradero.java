package problema;

import java.util.*;

public class Paradero {

    public ArrayList<Linea> lineas;
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

    public void addLinea(Linea line) {
        lineas.add(line);
    }

    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    private void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

}
