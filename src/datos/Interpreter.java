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

    public Interpreter() {
        this.f = new FileHandler(System.getProperty("user.dir") + "\\Archivos\\");

    }

    /**
     *
     * @return
     */
    public ArrayList<Paradero> datosParadero() {
        ArrayList<Paradero> paraderos = new ArrayList<>();
        for (String paradero : f.lectura("Paraderos.txt")) {
            String[] aux=paradero.split(";");
            //System.out.println(aux[0]);
            String[] aux2=aux[1].split(":");
            Paradero p = new Paradero(aux[0]);
            for (int i = 0; i < aux2.length; i++) {
                p.addLinea(aux2[i]);
            }
            paraderos.add(p);
        }
        return paraderos;
    }

    public ArrayList<Linea> datosLineas() {
        ArrayList<Linea> lineas = new ArrayList<>();
        for (String linea : f.lectura("Lineas.txt")) {
            String[] aux = linea.split(";");
            Linea l = new Linea(aux[0], aux[1], aux[2]);
            lineas.add(l);
        }
        return lineas;
    }
}
