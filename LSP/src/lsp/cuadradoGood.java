/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;

interface Forma {
    int getArea(); // metodo de obtener Área
}

public class cuadradoGood implements Forma{
    public int lado;

    public cuadradoGood(int lado) {
        this.lado = lado;
    }

    @Override
    public int getArea() {
        return lado*lado;
    }

    
}
