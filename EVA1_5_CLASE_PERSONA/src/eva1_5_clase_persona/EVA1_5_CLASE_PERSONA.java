/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_clase_persona;

/**
 *
 * @author alex_
 */
public class EVA1_5_CLASE_PERSONA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.setNombre("Juan Perez");
        perso1.setApellidos("Perez Jolote");
        perso1.setEdad(50);
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellido());
        System.out.println(perso1.getEdad());
        
    }
    
}

class Persona{
    //Atributos----> Estado del objeto
    //No puden ser accesible directamente
private String nombre;
private String apellidos;
private int edad;
//Metodos 
//Publicos---> Son la interface 
//Si son para manipilar los atributos hay un estandar 
//En java 
//Son opcionalesm no son obligatorios
//Metodos Set (Escritura) y Get(Lectura)
//Leer nombre :
public String getNombre() {
   return nombre;
   
}
//Escritura:
public void setNombre(String valor) {
     nombre = valor;
     

}
//Apellido
public String getApellido(){
    return apellidos;

}
public void setApellidos(String valor) {
     apellidos = valor;
}
public int getEdad() {
   return edad;
   
}
public void setEdad(int valor) {
     edad = valor;
     

}
}