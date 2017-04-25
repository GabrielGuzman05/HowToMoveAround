package howtomovearound;

import java.util.*;

public class Paradero {

	public ArrayList<Linea> lineas;
	private String codigo;
        
        Paradero(String c,Linea l){
            this.codigo=c;
            this.lineas=new ArrayList();
            this.lineas.add(l);
        }
        
        Paradero(String c){
            this.codigo=c;
            this.lineas=new ArrayList();
        }

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}