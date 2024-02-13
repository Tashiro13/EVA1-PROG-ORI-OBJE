/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_vehiculo;

/**
 *
 * @author alex_
 */
public class Vehiculo {
    private String Marca;
    private String Modelo;
    private int annio;
    private String Color;
    private double valor;
           

public String getMarca(){
   
        return Marca;
   
}

public void setMarca(String valor) {
     Marca = valor;
     

}
public String getModelo() {
   return Modelo;
   
}

public void setModelo(String valor) {
     Modelo = valor;
     

}
public int getAnnio() {
   return annio;
   
}

public void setAnnio(int valor) {
     annio = valor;
     

}
public String getColor() {
   return Color;
   
}

public void setColor(String valor) {
     Color = valor;
     

}
public double getValor() {
   return valor;
   
}

public void setValor(double precio) {
     valor = precio;
     

}
}


