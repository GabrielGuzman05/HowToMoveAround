/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtomovearound;

/**
 *
 * @author Gabriel
 */
public class HowToMoveAround {

    /**
     * @param args the command line arguments
     */
    
    private static Linea a1;
    private static Linea a2;
    private static Linea a3;
    
    private static Paradero p1;
    private static Paradero p2;
    private static Paradero p3;
    private static Paradero p4;
    
    public static void main(String[] args) {
        initialize();
        System.out.println("¿En que paradero desea buscar?");
    }
    
    public static void initialize(){
        p1=new Paradero("A001",a1);
        p2=new Paradero("A002",a2);
        p3=new Paradero("A003",a3);
        p4=new Paradero("A004",a1);
        a1=new Linea("1A",p1);
        a2=new Linea("1B",p2);
        a3=new Linea("1C",p3);
        p1.lineas.add(a2);
        p1.lineas.add(a3);
    }
    
}
