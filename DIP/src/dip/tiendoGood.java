/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dip;

interface metodoPago{
    public void pagar();
}

public class tiendoGood {
    private metodoPago metodoPago;

    public tiendoGood(metodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void realizarPago() {
        metodoPago.pagar();
    }
}
