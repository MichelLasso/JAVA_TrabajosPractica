/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

// 5. Escribe un programa para imprimir todas las letras del alfabeto de la 'a' a la 'z'.
// 6. Escribe un programa para imprimir el alfabeto en orden inverso, de la 'Z' a la 'A'.
public class ImprimirAlfabeto {
    public static void main(String[] args) {
        System.out.println("--");
        System.out.println("Normal");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }
        System.out.println("--");
        System.out.println("Inverso");
        for (char i = 'z'; i>='a'; i--) {
            System.out.println(i);
        }
    }
}
