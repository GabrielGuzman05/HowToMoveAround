package howtomovearound;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Datos {

    static String baseDirectory=System.getProperty("user.dir");
    
    static ArrayList<Paradero> paraderos;
    static ArrayList<Linea> lineas;
    
    public static void main(String [] Args){
        generarDatoParaderos();
        paraderos = new ArrayList();
        lineas = new ArrayList();
    }
    
    public static String leerarchivo(String archivo){
        Path directorio = Paths.get(baseDirectory+"\\Archivos\\"+archivo+".txt");
        String hola = "";
        try{
            hola = new String(Files.readAllBytes(directorio));
            //System.out.println(hola);
        }catch(IOException e){
            
        }
        return hola;
    }
    
    public static void generarDatoParaderos(){
        String datos=leerarchivo("Paraderos");
        for(String e : datos.split("/n")){
            String[] a=e.split(";");
            String name = a[0];
            String[] lines = a[1].split(":");
                Paradero p=new Paradero(name);
                paraderos.add(p);
        }
        
        String datos2=leerarchivo("Lineas");
        for(String e : datos2.split("/n")){
            String[] a=e.split(";");
            String name = a[0];
            String[] lines = a[1].split(":");
                Linea l=new Linea(name);
                lineas.add(l);
        }
        
        for(int i=0;;){}
    }
}