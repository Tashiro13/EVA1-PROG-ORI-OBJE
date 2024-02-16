/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_metodos;

/**
 *
 * @author alex_
 */
class Persona {
      private String Nombre, Apellido;
    private int Edad;
    
            

public String getNombre(){
   
   return Nombre;
   
}

public void setNombre(String valor) {
     Nombre = valor;
     

}
public String getApellido() {
   return Apellido;
   
}

public void setApellido(String valor) {
     Apellido = valor;
     

}
public int getEdad() {
   return Edad;
   
}

public void setEdad(int valor) {
     Edad = valor;
     

}
//reglas para el nombre de los metodos en Java
//es un verbo, empiza en minusculas 
public String generarNombreCom(){

return Nombre + " " + Apellido;

}
public int calcularAnnioNac(){
return 2024 - Edad;

}
}

