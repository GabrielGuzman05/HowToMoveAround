package datos;

import java.util.ArrayList;
import problema.Linea;
import problema.Paradero;

/**
 *
 * @author Gabriel
 */
public class Interpreter {

    private final FileHandler f;

    /**
     *Inicializa el FileHandler de la instancia de interpreter, este se inicia 
     * en el directorio del proyecto especificamente en la carpeta "Archivos".
     */
    public Interpreter() {
        this.f = new FileHandler(System.getProperty("user.dir") + "\\Archivos\\");

    }

    /**
     *Es el metodo que interpreta los datos del archivo de paraderos y los 
     * retorna en un formato entendible para el gestor del problema.
     * @return un ArrayList con los datos de cada paradero leido
     */
    public ArrayList<Paradero> datosParadero() {
        ArrayList<Paradero> paraderos = new ArrayList<>();
        for (String paradero : f.lectura("Paraderos.txt")) {
            String[] aux=paradero.split(";");
            //System.out.println(aux[0]);
            String[] aux2=aux[1].split(":");
            Paradero p = new Paradero(aux[0]);
            for (int i = 0; i < aux2.length; i++) {
                Linea l = new Linea(aux2[i]);
                p.addLinea(l);
            }
            paraderos.add(p);
        }
        return paraderos;
    }

    /**
     *Es el metodo que interpreta los datos del archivo de lineas y los 
     * retorna en un formato entendible para el gestor del problema.
     * @return un ArrayList con los datos de cada linea leido
     */
    public ArrayList<Linea> datosLineas() {
        ArrayList<Linea> lineas = new ArrayList<>();
        for (String linea : f.lectura("Lineas.txt")) {
            String[] aux = linea.split(";");
            Linea l = new Linea(aux[0], aux[1], aux[2]);
            lineas.add(l);
        }
        return lineas;
    }
    
    /**
     *Es el metodo que entrega el contenido del archivo html donde se
     * visualizan los recorridos, archivo llamado "Mapa_Recorridos.html".
     * @return un ArrayList con el contenido del html
     */
    public ArrayList<String> leerHtml(){
        return f.lectura("Mapa_Recorridos.html");
    }
    
    /**
     *Es el metodo que escribe en el archivo html donde se visualizan los 
     * recorridos, recordar que el metodo sobreescribira todo el archivo,
     * procurar cuidado de no borrar datos importantes.
     * @param newHtml El nuevo estado del html
     */
    public void escribirHtml(ArrayList<String> newHtml){
        f.escritura(newHtml, "Mapa_Recorridos.html");
    }
}
