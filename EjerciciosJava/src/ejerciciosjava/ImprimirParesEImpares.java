/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosjava;

// 7. Escribe un programa para imprimir todos los números pares entre 1 y 100.
// 8. Escribe un programa para imprimir todos los números impares entre 1 y 100.
public class ImprimirParesEImpares {
    public static void main(String[] args) {
        System.out.println("---");
        System.out.println("PARES 1-100");
        for (int i = 1; i <= 100; i++) {
            int par= i%2;
            if (par==0) {
                System.out.println(i);
            }
        }
        System.out.println("---");
        System.out.println("IMPARES 1-100");
        for (int i = 1; i <= 100; i++) {
            int par= i%2;
            if (par!=0) {
                System.out.println(i);
            }
        }
    }
}
