/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtomovearound;

import GUI.Menu_Principal;

/**
 *
 * @author Gabriel
 */
public class HowToMoveAround {

    /**El metodo por defecto que inicia el programa, se encarga de crear una
     * instancia de Menu Principal y volverla visible
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Menu_Principal menu = new Menu_Principal();
        menu.setVisible(true);
    }
}
