/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

/**
 *
 * @author alex_
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo micarrito = new Vehiculo();
        micarrito.setMarca("Ford");
        micarrito.setModelo("F150");
        micarrito.setAnnio(2024);
        micarrito.setValor(500000);
        micarrito.setColor("Rojo");
        
        System.out.println(micarrito.getMarca());
        System.out.println(micarrito.getModelo());
        System.out.println(micarrito.getAnnio());
        System.out.println(micarrito.getValor());
        System.out.println(micarrito.getColor());
    }
    
}
