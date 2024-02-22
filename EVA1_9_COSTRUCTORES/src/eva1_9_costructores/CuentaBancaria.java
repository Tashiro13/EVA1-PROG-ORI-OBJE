/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_9_costructores;

/**
 *
 * @author alex_
 */
public class CuentaBancaria {
    private int noCuenta;
    private double saldo;
    private String cliente;
    
    //Contructor
    public CuentaBancaria(){
    noCuenta = 0;
    cliente = "Sin cliente";
    saldo = 1000000;
    }
    
    //get y set
    public int getnoCuenta(){
    return noCuenta;
    
    }
    public void setnoCuenta(int cuenta){
    noCuenta = cuenta;
    
    }
    public String getCliente(){
    return cliente;
    
    }
    public double getSaldo(){
    return saldo;
    }
    public void setCliente(String nomCliente){
    cliente = nomCliente;
    }
    
    public void retirar(double monto){
    if(saldo >= monto)
        saldo = saldo - monto;
    }
    public void depositar(double deposito){
    saldo = saldo + deposito;
    }
}
