package howtomovearound;

import java.util.*;

public class Linea {

	ArrayList<Paradero> paraderos;
	private String nombre;
        
        Linea(String n){
            this.nombre=n;
        }
        
        Linea(String n,Paradero p){
            this.nombre=n;
            this.paraderos=new ArrayList();
            this.paraderos.add(p);
        }
        
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}