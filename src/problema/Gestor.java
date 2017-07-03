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

    private final ArrayList<Paradero> paraderos;
    private final ArrayList<Linea> lineas;

    /**
     *Metodo que inicializa los datos de los paraderos y las lineas
     */
    public Gestor() {
        Interpreter m = new Interpreter();
        lineas = m.datosLineas();
        paraderos = m.datosParadero();
    }

    /**
     *Es el metodo que permite entregar los nombres/codigos de todos los 
     * paraderos para su posterior uso.
     * @return un arrayList con todos los codigos de los paraderos encontrados
     */
    public ArrayList<String> codigosParaderos() {
        ArrayList<String> codigos = new ArrayList<>();
        for (Paradero p : paraderos) {
            codigos.add(p.getCodigo());
        }
        return codigos;
    }

    /**
     *Metodo que recibe el paradero seleccionado, muestra que lineas se 
     * encuentran en esta y finalmente permite seleccionar alguna mediante un
     * comboBox
     * @param paraderoSeleccionado codigo del paradero seleccionado
     * @return un String que corresponde a la direccion del html que contiene un
     * mapa con la linea que haya sido requerida
     */
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
    
    /**
     *Este metodo reemplaza en el archivo html que visualiza los recorridos, los
     * links que representan los recorridos que correspondan segun la linea que
     * se le entregue.
     * @param l una instancia de la clase linea
     */
    public void recorridosEnMapa(Linea l){
        Interpreter inter = new Interpreter();
        ArrayList<String> aux = inter.leerHtml();
        //lineas 32 y 40
        aux.add(31, "            L.tileLayer('"+l.getIda()+"', {");
        aux.remove(32);
        aux.add(39, "            L.tileLayer('"+l.getVuelta()+"', {");
        aux.remove(40);
        inter.escribirHtml(aux);
    }
}
