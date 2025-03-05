/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;
// comportamiento comun para diferentes formas
interface Forma {
    int getArea(); // metodo de obtener Área
}

public class rectanguloGood implements Forma{
    public int ancho, alto;

    public rectanguloGood(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public int getArea() {
        return ancho * alto;
    }

}


