/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip;

interface metodoPago{
    public void pagar();
}
public class pagoTrajetaGood implements metodoPago{
    public void pagar(){
        System.out.println("Pago con tarjeta de crédito:)");
    }
}
