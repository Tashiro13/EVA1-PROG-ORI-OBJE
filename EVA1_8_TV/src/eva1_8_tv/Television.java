/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_tv;

/**
 *
 * @author alex_
 */
public class Television {
    private int volumen;
    private int canal;
    private boolean estaEncendida;
    
    //Contrutores:
    //Constructor sin agumentos = constructor default
    //Metodo para inicializar los objetos 
    public Television(){
          volumen = 30;
          canal = 5;
          estaEncendida = false;
          
    }
    
    public void subirVolumen(){
       if(estaEncendida && (volumen < 100))
        volumen += 1;
       
    }
    public void bajarVolumen(){
       if(estaEncendida && (volumen > 0))
        volumen += -1;
       
    }
    public void subircanal(){
       if(estaEncendida )
        canal += 1;
       
    }
    public void bajarCanal(){
       if(estaEncendida && (canal > 0))
        canal += -1;
       
    }
    public void cambiarCanal(int noCanal){
    if(estaEncendida && !(noCanal < 0))
        canal = noCanal;
    }
    public void power(){
    /*if(estaEncendida == true)
        estaEncendida = false;
    else
        estaEncendida = true;*/
    estaEncendida = !estaEncendida;
    }
    public void imprimirConfig(){
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("Power: " + estaEncendida);
    }
}



