/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;

/**
 *
 * @author HP
 */
public class CuadradoBad extends rectanguloBad{

    @Override
    public void alto(int alto) {
        this.ancho=this.alto=alto;
    }

    @Override
    public void ancho(int ancho) {
        this.ancho=this.alto=ancho;
    }
    
    
}
