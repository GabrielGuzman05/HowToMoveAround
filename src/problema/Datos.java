package problema;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Datos {

    String baseDirectory=System.getProperty("user.dir");
    
    public ArrayList<Paradero> paraderos;
    public ArrayList<Linea> lineas;
    
    public void main(){
        paraderos = new ArrayList();
        lineas = new ArrayList();
        generarDatoParaderos();
    }
    
    public String leerarchivo(String archivo){
        Path directorio = Paths.get(baseDirectory+"\\Archivos\\"+archivo+".txt");
        String hola = "";
        try{
            hola = new String(Files.readAllBytes(directorio));
            //System.out.println(hola);
        }catch(IOException e){
            
        }
        return hola;
    }
    
    public void generarDatoParaderos(){
        String datos=leerarchivo("Paraderos");
        String datos2=leerarchivo("Lineas");
        for(String e : datos2.split(":")){
            Linea l=new Linea(e);
            lineas.add(l);
        }
        for(String e : datos.split("-")){
            String[] a=e.split(";");
            String name = a[0];
            String[] lines1 = a[1].split(":");
            Paradero p=new Paradero(name);
            paraderos.add(p);
            for(int i=0;i<lines1.length;i++){
                for(int n=0;n<lineas.size();n++){
                    if(lineas.get(n).getNombre().equals(lines1[i])){
                        p.lineas.add(lineas.get(n));
                    }
                }
            }    
        }
    }
}
