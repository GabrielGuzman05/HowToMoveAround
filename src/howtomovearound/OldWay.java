/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtomovearound;

import java.util.InputMismatchException;
import java.util.Scanner;
//import datos.Datos;

/**
 *
 * @author Gabriel
 */
public class OldWay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Datos dat = new Datos();
        //dat.main();
        System.out.println("¿En que paradero desea buscar?");
        boolean notFound = true;
        String paradero = "";
        int i;
        do {
            paradero = ingresarPalabras();
            /*for (i = 0; i < dat.paraderos.size(); i++) {
                if (dat.paraderos.get(i).getCodigo().equals(paradero)) {
                    notFound = false;
                    break;
                }
                if (i == dat.paraderos.size() - 1 && notFound) {
                    System.out.println("Paradero no existe, ingrese de nuevo");
                }
            }
            */
        } while (notFound);
        System.out.println("En este paradero se detienen las lineas");
        /*
        for (int n = 0; n < dat.paraderos.get(i).lineas.size(); n++) {
            System.out.println(dat.paraderos.get(i).lineas.get(n).getNombre());
        }
        */

    }

    public static String ingresarPalabras() {
        boolean error;
        String opcion = "";
        do {
            error = false;

            try {
                Scanner sc = new Scanner(System.in);
                opcion = sc.nextLine();
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("Error - Ingrese nuevamente");
            }
        } while (error);
        return opcion;
    }
}