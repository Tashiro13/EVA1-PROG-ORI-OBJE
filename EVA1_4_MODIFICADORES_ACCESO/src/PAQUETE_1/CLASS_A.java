/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PAQUETE_1;

import PAQUETE_2.B;
import PAQUETE_2.C;

/**
 *
 * @author alex_
 */
public class CLASS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        One obj1 = new One();
        System.out.println(obj1);
        
        //Clases del paquete 2
        B objB = new B();
               System.out.println(objB);
        //Two obj2 = new Two(); ----> no se pude usar porque no es accsible y tiene modificador default
        
         C objC= new C();
                System.out.println(objC);
         //Three obj3 = new Three(); ----> en este caso pasa lo mismo que en la clase Two
    }
    
}

class One{

}