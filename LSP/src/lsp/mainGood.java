/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lsp;


public class mainGood {
    public static void main(String[] args) {
        // si el metodo aplica a todas las claases hijass se crea en la clase padre
        // si el metodo solo alica a algunas clases se usa una interfaz (Forma)
        Forma rectangulo = new rectanguloGood(4, 5);
        Forma cuadrado = new cuadradoGood(4);

        System.out.println("Área Rectángulo: " + rectangulo.getArea()); // ✅ 20
        System.out.println("Área Cuadrado: " + cuadrado.getArea());     // ✅ 16
    }
}
