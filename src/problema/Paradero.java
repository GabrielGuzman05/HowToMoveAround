package problema;

import java.util.*;

/**
 *
 * @author Gabriel
 */
public class Paradero {

    private ArrayList<Linea> lineas;
    private String codigo;

    /**
     *Constructor para una insatancia de Paradero, trabaja con el codigo e 
     * inicializa el ArrayList de Lineas.
     * @param c un String que corresponde al codigo del paradero se usa el 
     * formato P+NUMERO
     */
    public Paradero(String c) {
        this.codigo = c;
        this.lineas = new ArrayList();
    }

    /**
     *
     * @return el codigo del paradero
     */
    public String getCodigo() {
        return this.codigo;
    }

    /**
     *
     * @param codigo el codigo del paradero
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     *El metodo que permite agregar un Linea al paradero
     * @param line Instancia de Linea que corresponde a la linea a agregar
     */
    public void addLinea(Linea line) {
        lineas.add(line);
    }

    /**
     *
     * @return un array con todas las lineas del paradero
     */
    public ArrayList<Linea> getLineas() {
        return lineas;
    }

    private void setLineas(ArrayList<Linea> lineas) {
        this.lineas = lineas;
    }

}
