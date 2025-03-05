/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lsp;

/**
 *
 * @author HP
 */
public class LSP {

    public static void main(String[] args) {
        rectanguloBad r = new CuadradoBad();
        r.ancho(4);
        r.alto(5);
        System.out.println("Área esperada: 20, Área real: " + r.getArea()); // Incorrecto
    }
    
}
