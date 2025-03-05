/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;

/**
 *
 * @author HP
 */
public class rectanguloBad {
    public int ancho;
    public int alto;

    public void ancho(int ancho){
        this.ancho=ancho;
    }
    public void alto(int alto){
        this.alto=alto;
    }

    public int getArea() { return ancho * alto; }
}
