package problema;

/**
 *
 * @author Gabriel
 */
public class Linea {

    private String nombre;
    private String ida;
    private String vuelta;

    /**
     *Metodo que crea una nueva linea a partir de su nombre
     * @param n un string que corresponde al nombre de la linea.
     */
    public Linea(String n) {
        this.nombre = n;
    }

    /**
     *Metodo que crea una nueva instancia de linea a partir de todos sus datos
     * nomre, ida y vuelta
     * @param nombre nombre de la linea se usa el formato NUMERO+LETRA
     * @param ida corresponde al link que contiene los datos del recorrido en 
     * ida
     * @param vuelta corresponde al link que contiene los datos del recorrido en 
     * vuelta
     */
    public Linea(String nombre, String ida, String vuelta) {
        this.nombre = nombre;
        this.ida = ida;
        this.vuelta = vuelta;
    }

    /**
     *
     * @return nombre de la linea un String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     *
     * @param nombre de la linea un String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return un string que corresponde al link del recorrido en modalidad 
     * de vuelta
     */
    public String getIda() {
        return ida;
    }

    /**
     *
     * @param ida link que corresponde al recorrido de ida
     */
    public void setIda(String ida) {
        this.ida = ida;
    }

    /**
     *
     * @return link que corresponde al recorrido de vuelta
     */
    public String getVuelta() {
        return vuelta;
    }

    /**
     *
     * @param vuelta link que corresponde al link de vuelta
     */
    public void setVuelta(String vuelta) {
        this.vuelta = vuelta;
    }

    @Override
    public String toString() {
        return "Linea{" + "nombre=" + nombre + '}';
    }
    
}
