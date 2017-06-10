package problema;


public class Linea {

	private String nombre;
        
        public Linea(String n){
            this.nombre=n;
        }
        
        public Linea(String n,Paradero p){
            this.nombre=n;
        }
        
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}