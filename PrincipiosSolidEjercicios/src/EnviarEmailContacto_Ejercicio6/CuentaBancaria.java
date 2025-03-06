/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnviarEmailContacto_Ejercicio6;

/**
 *
 * @author HP
 */
public class CuentaBancaria extends Contacto{
    public String CuentaBancaria;

    public CuentaBancaria(String CuentaBancaria, String Nombre, String Email) {
        super(Nombre, Email);
        this.CuentaBancaria = CuentaBancaria;
    }
    
}
