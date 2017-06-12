package problema;

public class Linea {

    private String nombre;
    private String ida;
    private String vuelta;

    public Linea(String n) {
        this.nombre = n;
    }

    public Linea(String nombre, String ida, String vuelta) {
        this.nombre = nombre;
        this.ida = ida;
        this.vuelta = vuelta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public String getVuelta() {
        return vuelta;
    }

    public void setVuelta(String vuelta) {
        this.vuelta = vuelta;
    }

    @Override
    public String toString() {
        return "Linea{" + "nombre=" + nombre + '}';
    }
    
}
