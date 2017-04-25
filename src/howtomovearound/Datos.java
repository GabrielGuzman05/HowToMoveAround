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
        paraderos = new ArrayList();
        lineas = new ArrayList();
        generarDatoParaderos();
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
        String datos2=leerarchivo("Lineas");
        for(String e : datos2.split(":")){
            Linea l=new Linea(e);
            lineas.add(l);
        }
        for(String e : datos.split("/n")){
            String[] a=e.split(";");
            String name = a[0];
            String[] lines1 = a[1].split(":");
            Paradero p=new Paradero(name);
            paraderos.add(p);
            if(lines1.length==1){
                int aux=0;
                for(int i=0;i<lineas.size();i++){
                    if(lineas.get(i).getNombre()==lines1[0]){
                        aux=i;
                        break;
                    }
                }
                p.lineas.add(lineas.get(aux));
            }else{
                int aux=0;
                for(int i=0;i<lines1.length;i++){
                    for(int n=0;n<lineas.size();n++){
                        if(lineas.get(n).getNombre()==lines1[i]){
                        aux=i;
                        break;
                        }
                    }
                    p.lineas.add(lineas.get(aux));
                }
            }
        }
    }
}
