/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dip;

/**
 *
 * @author HP
 */
public class DIP {

    /**
     * INCORRECTO
     * Una clase depende directamente de otra.
     * 
     * CORRECTO
     * Las clases dependen de abstracciones (interfaces), 
     * no de implementaciones concretas.
     */
    public static void main(String[] args) {
        System.out.println("Incorrecto---");
        tiendaBAD tiendita= new tiendaBAD();
        tiendita.realizarPago(); // solo permites pago con tarjeta
        
        System.out.println("Correcto ------------");
        tiendoGood tienda1 = new tiendoGood(new pagoTrajetaGood());
        tiendoGood tienda2 = new tiendoGood(new PayPalGood());

        tienda1.realizarPago(); //Pago con tarjeta de crédito
        tienda2.realizarPago(); //Pago con PayPal.
    }
}
