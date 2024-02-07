/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_intanciacion;

/**
 *
 * @author alex_
 */
public class EVA1_2_INTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        //INTANCIACION: Crear el objeto---> darle memoria 
        //CLASE IDENTIFICADOR = new CONSTRUCTOR 
        //Constructor --> Metodo con el mismo nombre de la clase 
        Persona perso1 = new Persona();//Instanciacion
        System.out.println(perso1);
        //Perso1---> referencia ----> direccion en memoria 
        Vehiculo carro = new Vehiculo();
        System.out.println(carro);
        carro.marca = "Dodge";
        carro.modelo = "Neon";
        carro.annio = 2000;
        System.out.println("Marca: " + carro.marca);
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Annio: " + carro.annio);
        
    }
    
}

//Tipo de dato abstracto 
class Persona{

}

class Vehiculo{
    //Atributos 
     String marca;
     int annio;
     String modelo;
     
    
}
