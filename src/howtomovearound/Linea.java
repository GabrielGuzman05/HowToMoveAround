package howtomovearound;

import java.util.*;

public class Linea {

	private String nombre;
        
        Linea(String n){
            this.nombre=n;
        }
        
        Linea(String n,Paradero p){
            this.nombre=n;
        }
        
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}