/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author alex_
 */
public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Juan");
        perso.setApellido("Perez");
        perso.setEdad(50);
        
        
        System.out.println("El nombre es " + perso.generarNombreCom());
        System.out.println("Nacio en el annio " + perso.calcularAnnioNac());
        
       //--------
       Persona[] grupo = new Persona[10];
        //hay que crear cada objeto
        for (int i = 0; i < grupo.length; i++) {
           Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            //Una vez creado hay que llenarlo
            System.out.println("Introdice el nombre:");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introdice el apellido");
            String ape = input.nextLine();
            grupo[i].setApellido(ape);
            
            System.out.println("Introduce la edad:");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
        }
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("El nombre es " + grupo[i].generarNombreCom());
            System.out.println("Nacio en el annio " + grupo[i].calcularAnnioNac());
        }
        
    }
    
}
