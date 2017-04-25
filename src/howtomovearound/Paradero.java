package howtomovearound;

import java.util.*;

public class Paradero {

	ArrayList<Linea> lineas;
	private String codigo;
        
        Paradero(String c,Linea l){
            this.codigo=c;
            this.lineas=new ArrayList();
            this.lineas.add(l);
        }
        
        Paradero(String c){
            this.codigo=c;
        }

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}