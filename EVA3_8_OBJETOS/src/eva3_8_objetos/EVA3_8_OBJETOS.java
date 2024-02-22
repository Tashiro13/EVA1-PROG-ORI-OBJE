/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_objetos;

/**
 *
 * @author alex_
 */
public class EVA3_8_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Juan";
        perso1.apellido = "Perez";
        perso1.edad = 50;
        System.out.println(perso1);
        imprimirpersonas(perso1);
        
        Persona perso2 = new Persona();
        perso2.nombre = "Pedro";
        perso2.apellido = "Paramo";
        perso2.edad = 70;
        System.out.println(perso2);
        imprimirpersonas(perso2);
    }
    public static void imprimirpersonas(Persona perso){
        System.out.println("Direccion" + perso);
        System.out.println("Nombre completo: " + perso.nombre + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
}
class Persona{
    String nombre, apellido;
    int edad;
    
}
