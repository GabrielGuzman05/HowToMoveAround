package datos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//import problema.*;

public class FileHandler {
    
    private final String ruta;

    public FileHandler(String ruta) {
        this.ruta = ruta;
    }
    
    public ArrayList<String> lectura(String archivo) {

        ArrayList<String> datos = new ArrayList<>();

        // Fichero del que queremos leer
        File fichero = new File(ruta+archivo);
        //System.out.println(ruta+archivo);
        Scanner s = null;

        try {
            // Leemos el contenido del fichero
            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                //System.out.println(linea);
                datos.add(linea);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }

        /*
        for(Persona p : datos){
            System.out.println(p.toString1());
        }
         */
        return datos;
    }
}
