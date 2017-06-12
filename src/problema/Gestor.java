/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

import datos.Interpreter;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Gestor {

    private ArrayList<Paradero> paraderos;
    private ArrayList<Linea> lineas;

    /**
     *
     */
    public Gestor() {
        Interpreter m = new Interpreter();
        lineas = m.datosLineas();
        paraderos = m.datosParadero();
    }

    public ArrayList<String> codigosParaderos() {
        ArrayList<String> codigos = new ArrayList<>();
        for (Paradero p : paraderos) {
            codigos.add(p.getCodigo());
        }
        return codigos;
    }

    public String lineaRequerida(String paraderoSeleccionado) {
        Paradero aux = null;
        for (Paradero p : paraderos) {
            if (paraderoSeleccionado.equals(p.getCodigo())) {
                aux = p;
                break;
            }
        }
        
        ArrayList<Linea> correspondedLineas = new ArrayList<>();
        for (String linea : aux.getLineas()) {
            for (Linea l : lineas) {
                if (linea.equals(l.getNombre())) {
                    correspondedLineas.add(l);
                }
            }
        }
        //JOptionPane.showMessageDialog(null, correspondedLineas.toString());
        JComboBox jcb = new JComboBox();
        for (int i = 0; i < correspondedLineas.size(); i++) {
            jcb.addItem(correspondedLineas.get(i).getNombre());
        }
        JOptionPane.showMessageDialog(null, jcb, "Seleccione el tipo de dato a buscar", JOptionPane.QUESTION_MESSAGE);
        
        return jcb.getSelectedItem().toString();
    }
}
