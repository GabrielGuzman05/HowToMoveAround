/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema;

import datos.FileHandler;
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
        for (Linea linea : aux.getLineas()) {
            for (Linea l : lineas) {
                if (linea.getNombre().equals(l.getNombre())) {
                    correspondedLineas.add(l);
                    //System.out.println(l.getIda()+"-----"+l.getVuelta());
                }
            }
        }
        //JOptionPane.showMessageDialog(null, correspondedLineas.toString());
        JComboBox jcb = new JComboBox();
        for (int i = 0; i < correspondedLineas.size(); i++) {
            jcb.addItem(correspondedLineas.get(i).getNombre());
        }
        JOptionPane.showMessageDialog(null, jcb, "Seleccione que linea desea mostrar", JOptionPane.QUESTION_MESSAGE);
        //System.out.println(jcb.getSelectedItem().toString());
        recorridosEnMapa(correspondedLineas.get(jcb.getSelectedIndex()));
        return System.getProperty("user.dir") + "\\Archivos\\Mapa_Recorridos.html";
    }
    
    public void recorridosEnMapa(Linea l){
        FileHandler file = new FileHandler(System.getProperty("user.dir") + "\\Archivos\\");
        ArrayList<String> aux = file.lectura("Mapa_Recorridos.html");
        //lineas 32 y 40
        aux.add(31, "            L.tileLayer('"+l.getIda()+"', {");
        aux.remove(32);
        aux.add(39, "            L.tileLayer('"+l.getVuelta()+"', {");
        aux.remove(40);
        file.escritura(aux, "Mapa_Recorridos.html");
    }
}
