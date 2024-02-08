/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_modificadores_acceso;

import OTRO_PAQUETE.OtraClase;
import OTRO_PAQUETE.OtraClasse;

/**
 *
 * @author alex_
 */
public class EVA1_3_MODIFICADORES_ACCESO {
   public int x;
   protected int y;
   private int z;
   int w;
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaA objA = new PruebaA();
       // objA.----> puedo ver x (public)
       //puedo ver a y (protected)
       //puedo ver a w (default)
       OtraClasse otroObj = new OtraClase();
       // otroObj. ---> se ve x porque es public
       //los otros no son visbles 
       //PruebaB ObjB = new PruebaB(); ----> Este clase no es visible en este paquete 
    }
    
}
//Estas clases son acceso defautl 
class PruebaA{
   public int x;
   protected int y;
   private int z;
   int w;
   
}